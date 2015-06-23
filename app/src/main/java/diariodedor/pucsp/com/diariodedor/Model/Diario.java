package diariodedor.pucsp.com.diariodedor.Model;

import java.util.Date;
import java.util.List;

/**
 * Created by enzo on 22/06/2015.
 */
public class Diario
{
    private InforDor InfoDor;
    private List<ParteCorpo> PartesCorpo;
    private Date Data;

    public Diario(InforDor inforDor, List<ParteCorpo> partesCorpo)
    {
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
}
