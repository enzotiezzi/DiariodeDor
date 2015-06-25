package diariodedor.pucsp.com.diariodedor.Model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by enzo on 22/06/2015.
 */
public class Diario
{
    private int Id;
    private int IdPaciente;
    private InforDor InfoDor;
    private List<ParteCorpo> PartesCorpo;
    private Date Data;

    public Diario(InforDor inforDor, List<ParteCorpo> partesCorpo, int idPaciente)
    {
        this.IdPaciente = idPaciente;
        this.InfoDor = inforDor;
        this.PartesCorpo = partesCorpo;
        this.Data = new Date();
    }

    public InforDor getInfoDor()
    {
        return InfoDor;
    }

    public List<ParteCorpo> getPartesCorpo()
    {
        return PartesCorpo;
    }

    public void setId(int id)
    {
        Id = id;
    }

    @Override
    public String toString()
    {
        return "Diário do dia " + new SimpleDateFormat("dd/MM/yyyy").format(this.Data);
    }
}
