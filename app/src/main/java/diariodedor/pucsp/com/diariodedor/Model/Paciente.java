package diariodedor.pucsp.com.diariodedor.Model;

import java.util.Date;

public class Paciente
{
    private int Id;
    private String Nome;
    private String Profissao;
    private String Escolaridade;
    private String Diagnostico;
    private String TempoDoenca;
    private String MelhorHorario;
    private String EmailMedico;

    public Paciente(String nome, String profissao, String escolaridade, String diagnostico, String tempoDoenca, String melhorHorario, String emailMedico)
    {
        this.Nome = nome;
        this.Profissao = profissao;
        this.Escolaridade = escolaridade;
        this.Diagnostico = diagnostico;
        this.TempoDoenca = tempoDoenca;
        this.MelhorHorario = melhorHorario;
        this.EmailMedico = emailMedico;
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

    public String getEmailMedico()
    {
        return EmailMedico;
    }

    public int getId()
    {
        return Id;
    }

    public void setId(int id)
    {
        Id = id;
    }
}
