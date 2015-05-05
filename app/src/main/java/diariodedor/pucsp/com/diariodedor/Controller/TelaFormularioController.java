package diariodedor.pucsp.com.diariodedor.Controller;

import android.content.Context;

import java.io.IOException;

import diariodedor.pucsp.com.diariodedor.Factory.PacienteFactory;
import diariodedor.pucsp.com.diariodedor.Model.Paciente;
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

            FileManagement fileManagement = new FileManagement();

            fileManagement.salvarInfoPaciente(p);

            ShowInformation.showToast("Gravado com sucesso!!", Context);
        }
        catch(IOException e)
        {
            ShowInformation.showToast("Houve um erro ao salvar o arquivo, tente novamente", Context);
        }
        catch(Exception e)
        {
            ShowInformation.showToast(e.getMessage(), Context);
        }
    }
}
