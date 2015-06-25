package diariodedor.pucsp.com.diariodedor.Controller;

import android.content.Context;

import com.google.gson.Gson;

import java.io.IOException;

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
        try
        {
            PacienteFactory pacienteFactory = new PacienteFactory();

            Paciente p = pacienteFactory.newInstance(nome, profissao, escolaridade, diagnostico, tempoDoenca, melhorHorario, email);

            RequisitionTask.enviarRequisicao(new RequisitionTask.OnRequisitionEnd()
            {
                @Override
                public void onRequisitionEnd(String json, int status, Exception e)
                {
                    Paciente p = new Gson().fromJson(json, Paciente.class);
                    try
                    {
                        FileManagement fileManagement = new FileManagement();
                        fileManagement.salvarInfoPaciente(p);
                    }
                    catch(IOException ex)
                    {
                        ShowInformation.showToast("Erro durante gravação de dados", Context);
                    }

                    ShowInformation.showToast("Gravado com sucesso!!", Context);
                }
            }, URLs.localhost+"paciente/create.php", "POST", p, Context);
        }
        catch(Exception e)
        {
            ShowInformation.showToast(e.getMessage(), Context);
        }
    }
}
