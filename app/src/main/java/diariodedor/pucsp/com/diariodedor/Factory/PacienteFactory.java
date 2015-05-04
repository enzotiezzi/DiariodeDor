package diariodedor.pucsp.com.diariodedor.Factory;

import diariodedor.pucsp.com.diariodedor.Model.Paciente;

/**
 * Created by enzo on 02/05/2015.
 */
public class PacienteFactory
{
    public PacienteFactory()
    {}

    public Paciente newInstance(String nome, String profissao, String escolaridade, String diagnostico, String tempoDoenca, String melhorHorario)
    {
        Paciente p = null;

        //TODO validacoes

        p = new Paciente(nome, profissao, escolaridade, diagnostico, tempoDoenca, melhorHorario);

        return p;
    }
}
