package diariodedor.pucsp.com.diariodedor.Model;

/**
 * Created by enzo on 03/05/2015.
 */
public class InforDor
{
    private byte IntensidadeDor;
    private byte Ansioso;
    private byte Deprimido;
    private byte Cansado;
    private byte Dormir;

    private boolean Exercicio;

    private String RemediosDor;
    private String Obs;

    public InforDor(byte intensidadeDor, byte ansioso, byte deprimido, byte cansado, byte dormir, boolean exercicio, String remediosDor, String obs)
    {
        this.IntensidadeDor = intensidadeDor;
        this.Ansioso = ansioso;
        this.Deprimido = deprimido;
        this.Cansado = cansado;
        this.Dormir = dormir;
        this.Exercicio = exercicio;
        this.RemediosDor = remediosDor;
        this.Obs = obs;
    }

    public InforDor()
    {}

    public byte getAnsioso()
    {
        return Ansioso;
    }

    public byte getCansado()
    {
        return Cansado;
    }

    public byte getDeprimido()
    {
        return Deprimido;
    }

    public byte getDormir()
    {
        return Dormir;
    }

    public byte getIntensidadeDor()
    {
        return IntensidadeDor;
    }

    public String getObs()
    {
        return Obs;
    }

    public String getRemediosDor()
    {
        return RemediosDor;
    }

    public boolean isExercicio()
    {
        return Exercicio;
    }

    public void setAnsioso(byte ansioso)
    {
        Ansioso = ansioso;
    }

    public void setCansado(byte cansado)
    {
        Cansado = cansado;
    }

    public void setDeprimido(byte deprimido)
    {
        Deprimido = deprimido;
    }

    public void setDormir(byte dormir)
    {
        Dormir = dormir;
    }

    public void setExercicio(boolean exercicio)
    {
        Exercicio = exercicio;
    }

    public void setIntensidadeDor(byte intensidadeDor)
    {
        IntensidadeDor = intensidadeDor;
    }

    public void setObs(String obs)
    {
        Obs = obs;
    }

    public void setRemediosDor(String remediosDor)
    {
        RemediosDor = remediosDor;
    }
}
