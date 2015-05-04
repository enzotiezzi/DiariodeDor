package diariodedor.pucsp.com.diariodedor.Model;

/**
 * Created by enzo on 03/05/2015.
 */
public class ParteCorpo
{
    private int Id;
    private String Nome;

    public ParteCorpo(int id, String nome)
    {
        this.Id = id;
        this.Nome = nome;
    }

    public String getNome()
    {
        return Nome;
    }

    public int getId()
    {
        return Id;
    }
}
