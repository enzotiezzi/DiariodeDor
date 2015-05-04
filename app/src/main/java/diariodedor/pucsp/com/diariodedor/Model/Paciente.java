package diariodedor.pucsp.com.diariodedor.Model;

import java.util.Date;

public class Paciente
{
    private String Nome;
    private String Profissao;
    private String Escolaridade;
    private String Diagnostico;
    private String TempoDoenca;
    private String MelhorHorario;

    public Paciente(String nome, String profissao, String escolaridade, String diagnostico, String tempoDoenca, String melhorHorario)
    {
        this.Nome = nome;
        this.Profissao = profissao;
        this.Escolaridade = escolaridade;
        this.Diagnostico = diagnostico;
        this.TempoDoenca = tempoDoenca;
        this.MelhorHorario = melhorHorario;
    }

    public String getDiagnostico()
    {
        return Diagnostico;
    }

    public String getEscolaridade()
    {
        return Escolaridade;
    }

    public String getMelhorHorario()
    {
        return MelhorHorario;
    }

    public String getNome()
    {
        return Nome;
    }

    public String getProfissao()
    {
        return Profissao;
    }

    public String getTempoDoenca()
    {
        return TempoDoenca;
    }
}
