package diariodedor.pucsp.com.diariodedor.Controller;

import android.content.Context;
import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import diariodedor.pucsp.com.diariodedor.Model.InforDor;
import diariodedor.pucsp.com.diariodedor.Model.ParteCorpo;
import diariodedor.pucsp.com.diariodedor.R;

/**
 * Created by enzo on 02/05/2015.
 */
public class TelaCorpoController
{
    private Context Context;
    private List<ParteCorpo> partesCorpo;
    private InforDor inforDor;

    public TelaCorpoController(Context context)
    {
        this.Context = context;
        this.partesCorpo = new ArrayList<ParteCorpo>();
        this.inforDor = new InforDor();
    }

    public List<ParteCorpo> getPartesCorpo()
    {
        return partesCorpo;
    }

    public void addPartesCorpo(List<ParteCorpo> partesCorpo)
    {
        this.partesCorpo.addAll(partesCorpo);
    }

    //Metodo que recebe id do checkbox e se ele foi checado ou deschecado
    public void adicionaRemoveParteCorpo(int checkBoxId, boolean isChecked)
    {
        if (!isChecked)
            remover(checkBoxId);
        else
        {
            switch (checkBoxId)
            {
                case R.id.checkBoxRosto:
                    adicionar(checkBoxId, "Rosto");
                    break;

                case R.id.checkBoxMandibulaEsq:
                    adicionar(checkBoxId, "Mandibula Esquerda");
                    break;

                case R.id.checkBoxMandibulaDir:
                    adicionar(checkBoxId, "Mandibula Direita");
                    break;

                case R.id.checkBoxPescoco:
                    adicionar(checkBoxId, "Pesco�o");
                    break;

                case R.id.checkBoxOmbroEsq:
                    adicionar(checkBoxId, "Ombro Esquerdo");
                    break;

                case R.id.checkBoxOmbroDir:
                    adicionar(checkBoxId, "Ombro Direito");
                    break;

                case R.id.checkBoxTorax:
                    adicionar(checkBoxId, "T�rax");
                    break;

                case R.id.checkBoxBracoEsq:
                    adicionar(checkBoxId, "Bra�o Esquerdo");
                    break;

                case R.id.checkBoxBracoDir:
                    adicionar(checkBoxId, "Bra�o Direito");
                    break;

                case R.id.checkBoxCotoveloEsq:
                    adicionar(checkBoxId, "Cotovelo Esquerdo");
                    break;

                case R.id.checkBoxCotoveloDir:
                    adicionar(checkBoxId, "Cotovelo Direito");
                    break;

                case  R.id.checkBoxAnteBracoEsq:
                    adicionar(checkBoxId, "Antebra�o Esquerdo");
                    break;

                case R.id.checkBoxAnteBracoDir:
                    adicionar(checkBoxId, "Antebra�o Direito");
                    break;

                case R.id.checkBoxMaoEsq:
                    adicionar(checkBoxId, "Punho e M�o Esquerda");
                    break;

                case R.id.checkBoxMaoDir:
                    adicionar(checkBoxId, "Punho e M�o Direita");
                    break;

                case R.id.checkBoxAbdomen:
                    adicionar(checkBoxId, "Abd�men");
                    break;

                case R.id.checkBoxQuadrilEsq:
                    adicionar(checkBoxId, "Quadril Esquerdo");
                    break;

                case R.id.checkBoxQuadrilDir:
                    adicionar(checkBoxId, "Quadril Direito");
                    break;

                case R.id.checkBoxCoxaEsq:
                    adicionar(checkBoxId, "Coxa Esquerda");
                    break;

                case R.id.checkBoxCoxaDir:
                    adicionar(checkBoxId, "Coxa Direita");
                    break;

                case R.id.checkBoxJoelhoEsq:
                    adicionar(checkBoxId, "Joelho Esquerdo");
                    break;

                case R.id.checkBoxJoelhoDir:
                    adicionar(checkBoxId, "Joelho Direito");
                    break;

                case R.id.checkBoxPernaEsq:
                    adicionar(checkBoxId, "Perna Esquerda");
                    break;

                case R.id.checkBoxPernaDir:
                    adicionar(checkBoxId, "Perna Direita");
                    break;

                case R.id.checkBoxPeEsq:
                    adicionar(checkBoxId, "P� e Tornozelo Esquerdo");
                    break;

                case R.id.checkBoxPeDir:
                    adicionar(checkBoxId, "P� e Tornozelo Direito");
                    break;
            }
        }
    }

    public void adicionarRemoveParteCostas(int checkBoxId, boolean isChecked)
    {
        if(!isChecked)
            remover(checkBoxId);
        else
        {
            switch(checkBoxId)
            {
                case R.id.checkBoxCostasPescoco:
                    adicionar(checkBoxId, "Pesco�o Costas");
                    break;

                case R.id.checkBoxCostasOmbroEsq:
                    adicionar(checkBoxId, "Ombro Esquerda Costas");
                    break;

                case R.id.checkBoxCostasOmbroDir:
                    adicionar(checkBoxId, "Ombro Direita Costas");
                    break;

                case R.id.checkBoxCostasBracoEsq:
                    adicionar(checkBoxId, "Bra�o Esquerdo Costas");
                    break;

                case R.id.checkBoxCostasBracoDir:
                    adicionar(checkBoxId, "Bra�o Direito Costas");
                    break;

                case R.id.checkBoxCostasCotoveloEsq:
                    adicionar(checkBoxId, "Cotovelo Esquerdo Costas");
                    break;

                case R.id.checkBoxCostasCotoveloDir:
                    adicionar(checkBoxId, "Cotovelo Direito Costas");
                    break;

                case R.id.checkBoxCostasAntebracoEsq:
                    adicionar(checkBoxId, "Antebra�o Esquerdo Costas");
                    break;

                case R.id.checkBoxCostasAntebracoDir:
                    adicionar(checkBoxId, "Antebra�o Direito Costas");
                    break;

                case R.id.checkBoxCostasMaoEsq:
                    adicionar(checkBoxId, "Punho e M�o Esquerda Costas");
                    break;

                case R.id.checkBoxCostasMaoDir:
                    adicionar(checkBoxId, "Punho e M�o Direita Costas");
                    break;

                case R.id.checkBoxCostasQuadrilEsq:
                    adicionar(checkBoxId, "Quadril Esquerdo Costas");
                    break;

                case R.id.checkBoxCostasQuadrilDir:
                    adicionar(checkBoxId, "Quadril Direito Costas");
                    break;

                case R.id.checkBoxCostasCoxaEsq:
                    adicionar(checkBoxId, "Coxa Esquerda Costas");
                    break;

                case R.id.checkBoxCostasCoxaDir:
                    adicionar(checkBoxId, "Coxa Direita Costas");
                    break;

                case R.id.checkBoxCostasJoelhoEsq:
                    adicionar(checkBoxId, "Joelho Esquerdo Costas");
                    break;

                case R.id.checkBoxCostasJoelhoDir:
                    adicionar(checkBoxId, "Joelho Direito Costas");
                    break;

                case R.id.checkBoxCostasPernaEsq:
                    adicionar(checkBoxId, "Perna Esquerda Costas");
                    break;

                case R.id.checkBoxCostasPernaDir:
                    adicionar(checkBoxId, "Perna Direita Costas");
                    break;

                case R.id.checkBoxCostasPeEsq:
                    adicionar(checkBoxId, "P� e Tornozelo Esquerdo Costas");
                    break;

                case R.id.checkBoxCostasPeDir:
                    adicionar(checkBoxId, "P� e Tornozelo Direito Costas");
                    break;
            }
        }
    }

    public void adicionar(int id, String nome)
    {
        partesCorpo.add(new ParteCorpo(id, nome));
    }

    public void remover(int id)
    {
        Iterator<ParteCorpo> iterator = partesCorpo.iterator();

        while (iterator.hasNext())
        {
            ParteCorpo p = iterator.next();

            if (p.getId() == id)
                iterator.remove();
        }
    }


}
