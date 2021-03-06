package diariodedor.pucsp.com.diariodedor.Factory;

import diariodedor.pucsp.com.diariodedor.Model.Paciente;

/**
 * Created by enzo on 02/05/2015.
 */
public class PacienteFactory
{
    public PacienteFactory()
    {}

    public Paciente newInstance(String nome, String profissao, String escolaridade, String diagnostico, String tempoDoenca, String melhorHorario, String email)
    {
        Paciente p = null;

        //TODO validacoes
        if (nome.trim().length() == 0)
            throw new IllegalArgumentException("Preencha o campo nome corretamente");
        else
            p = new Paciente(nome, profissao, escolaridade, diagnostico, tempoDoenca, melhorHorario, email);

        return p;
    }
}
