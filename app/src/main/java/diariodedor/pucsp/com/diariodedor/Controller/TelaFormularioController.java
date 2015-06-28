package diariodedor.pucsp.com.diariodedor.Controller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

import com.google.gson.Gson;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.UnknownHostException;

import diariodedor.pucsp.com.diariodedor.Factory.PacienteFactory;
import diariodedor.pucsp.com.diariodedor.Model.Paciente;
import diariodedor.pucsp.com.diariodedor.Requisition.RequisitionTask;
import diariodedor.pucsp.com.diariodedor.Requisition.URLs;
import diariodedor.pucsp.com.diariodedor.Util.FileManagement;
import diariodedor.pucsp.com.diariodedor.Util.ShowInformation;

/**
 * Created by enzo on 02/05/2015.
 */
public class TelaFormularioController
{
    private Context Context;

    public TelaFormularioController(Context context)
    {
        this.Context = context;
    }

    public void salvarInfoPaciente(String nome, String profissao, String escolaridade, String diagnostico, String tempoDoenca, String melhorHorario, String email)
    {
        if (new TelaCorpoController(Context).lerInfoPaciente() == null)
        {
            try
            {
                PacienteFactory pacienteFactory = new PacienteFactory();

                final Paciente p = pacienteFactory.newInstance(nome, profissao, escolaridade, diagnostico, tempoDoenca, melhorHorario, email);

                RequisitionTask.enviarRequisicao(new RequisitionTask.OnRequisitionEnd()
                {
                    @Override
                    public void onRequisitionEnd(String json, int status, Exception e)
                    {
                        if (e == null)
                        {
                            Paciente paciente = new Gson().fromJson(json, Paciente.class);
                            try
                            {
                                FileManagement fileManagement = new FileManagement();
                                fileManagement.salvarInfoPaciente(paciente);
                            } catch (IOException ex)
                            {
                                ShowInformation.showToast("Erro durante gravação de dados", Context);
                            }

                            if (status == 200)
                                ShowInformation.showToast("Gravado com sucesso!!", Context);
                        }
                        else
                        {
                            if (e instanceof UnknownHostException)
                            {
                                try
                                {
                                    FileManagement fileManagement = new FileManagement();
                                    fileManagement.salvarInfoPaciente(p);
                                }
                                catch (IOException ex)
                                {
                                    ShowInformation.showToast("Erro durante gravação de dados", Context);
                                }

                                new Handler(Looper.getMainLooper()).post(new Runnable()
                                {
                                    @Override
                                    public void run()
                                    {
                                        ShowInformation.showToast("Sem conexão de internet, seu registro foi gravado no celular", Context);
                                    }
                                });
                            }
                        }
                    }
                }, URLs.localhost + "paciente/create.php", "POST", p, Context);
            }
            catch(Exception e)
            {
                ShowInformation.showToast(e.getMessage(), Context);
            }
        }
    }
}
