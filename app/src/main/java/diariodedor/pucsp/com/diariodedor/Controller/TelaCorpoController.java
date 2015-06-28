package diariodedor.pucsp.com.diariodedor.Controller;

import android.content.Context;
import android.os.Handler;
import android.widget.CheckBox;
import android.widget.RadioGroup;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import diariodedor.pucsp.com.diariodedor.Model.Diario;
import diariodedor.pucsp.com.diariodedor.Model.InforDor;
import diariodedor.pucsp.com.diariodedor.Model.Paciente;
import diariodedor.pucsp.com.diariodedor.Model.ParteCorpo;
import diariodedor.pucsp.com.diariodedor.R;
import diariodedor.pucsp.com.diariodedor.Requisition.RequisitionTask;
import diariodedor.pucsp.com.diariodedor.Requisition.URLs;
import diariodedor.pucsp.com.diariodedor.Util.FileManagement;
import diariodedor.pucsp.com.diariodedor.Util.ShowInformation;

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
                    adicionar(checkBoxId, "Pescoço");
                    break;

                case R.id.checkBoxOmbroEsq:
                    adicionar(checkBoxId, "Ombro Esquerdo");
                    break;

                case R.id.checkBoxOmbroDir:
                    adicionar(checkBoxId, "Ombro Direito");
                    break;

                case R.id.checkBoxTorax:
                    adicionar(checkBoxId, "Tórax");
                    break;

                case R.id.checkBoxBracoEsq:
                    adicionar(checkBoxId, "Braço Esquerdo");
                    break;

                case R.id.checkBoxBracoDir:
                    adicionar(checkBoxId, "Braço Direito");
                    break;

                case R.id.checkBoxCotoveloEsq:
                    adicionar(checkBoxId, "Cotovelo Esquerdo");
                    break;

                case R.id.checkBoxCotoveloDir:
                    adicionar(checkBoxId, "Cotovelo Direito");
                    break;

                case  R.id.checkBoxAnteBracoEsq:
                    adicionar(checkBoxId, "Antebraço Esquerdo");
                    break;

                case R.id.checkBoxAnteBracoDir:
                    adicionar(checkBoxId, "Antebraço Direito");
                    break;

                case R.id.checkBoxMaoEsq:
                    adicionar(checkBoxId, "Punho e Mão Esquerda");
                    break;

                case R.id.checkBoxMaoDir:
                    adicionar(checkBoxId, "Punho e Mão Direita");
                    break;

                case R.id.checkBoxAbdomen:
                    adicionar(checkBoxId, "Abdômen");
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
                    adicionar(checkBoxId, "Pé e Tornozelo Esquerdo");
                    break;

                case R.id.checkBoxPeDir:
                    adicionar(checkBoxId, "Pé e Tornozelo Direito");
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
                    adicionar(checkBoxId, "Pescoço Costas");
                    break;

                case R.id.checkBoxCostasOmbroEsq:
                    adicionar(checkBoxId, "Ombro Esquerda Costas");
                    break;

                case R.id.checkBoxCostasOmbroDir:
                    adicionar(checkBoxId, "Ombro Direita Costas");
                    break;

                case R.id.checkBoxCostasBracoEsq:
                    adicionar(checkBoxId, "Braço Esquerdo Costas");
                    break;

                case R.id.checkBoxCostasBracoDir:
                    adicionar(checkBoxId, "Braço Direito Costas");
                    break;

                case R.id.checkBoxCostasCotoveloEsq:
                    adicionar(checkBoxId, "Cotovelo Esquerdo Costas");
                    break;

                case R.id.checkBoxCostasCotoveloDir:
                    adicionar(checkBoxId, "Cotovelo Direito Costas");
                    break;

                case R.id.checkBoxCostasAntebracoEsq:
                    adicionar(checkBoxId, "Antebraço Esquerdo Costas");
                    break;

                case R.id.checkBoxCostasAntebracoDir:
                    adicionar(checkBoxId, "Antebraço Direito Costas");
                    break;

                case R.id.checkBoxCostasMaoEsq:
                    adicionar(checkBoxId, "Punho e Mão Esquerda Costas");
                    break;

                case R.id.checkBoxCostasMaoDir:
                    adicionar(checkBoxId, "Punho e Mão Direita Costas");
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
                    adicionar(checkBoxId, "Pé e Tornozelo Esquerdo Costas");
                    break;

                case R.id.checkBoxCostasPeDir:
                    adicionar(checkBoxId, "Pé e Tornozelo Direito Costas");
                    break;

                case R.id.checkBoxCostas:
                    adicionar(checkBoxId, "Costas");
                    break;

                case R.id.checkBoxCostasLombar:
                    adicionar(checkBoxId, "Lombar");
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

    public void setarInfo(int radioGroupId, int radioId)
    {
        byte valor = 0;
        switch (radioId)
        {
            case R.id.radioButton:
            case R.id.radioButton12:
            case R.id.radioButton78:
            case R.id.radioButton89:
            case R.id.radioButton100:
                valor = 0;
                break;

            case R.id.radioButton2:
            case R.id.radioButton13:
            case R.id.radioButton79:
            case R.id.radioButton90:
            case R.id.radioButton101:
                valor = 1;
                break;

            case R.id.radioButton3:
            case R.id.radioButton14:
            case R.id.radioButton80:
            case R.id.radioButton91:
            case R.id.radioButton102:
                valor = 2;
                break;

            case R.id.radioButton4:
            case R.id.radioButton15:
            case R.id.radioButton81:
            case R.id.radioButton92:
            case R.id.radioButton103:
                valor = 3;
                break;

            case R.id.radioButton5:
            case R.id.radioButton16:
            case R.id.radioButton82:
            case R.id.radioButton93:
            case R.id.radioButton104:
                valor = 4;
                break;

            case R.id.radioButton6:
            case R.id.radioButton17:
            case R.id.radioButton83:
            case R.id.radioButton94:
            case R.id.radioButton105:
                valor = 5;
                break;

            case R.id.radioButton7:
            case R.id.radioButton18:
            case R.id.radioButton84:
            case R.id.radioButton95:
            case R.id.radioButton106:
                valor = 6;
                break;

            case R.id.radioButton8:
            case R.id.radioButton19:
            case R.id.radioButton85:
            case R.id.radioButton96:
            case R.id.radioButton107:
                valor = 7;
                break;

            case R.id.radioButton9:
            case R.id.radioButton20:
            case R.id.radioButton86:
            case R.id.radioButton97:
            case R.id.radioButton108:
                valor = 8;
                break;

            case R.id.radioButton10:
            case R.id.radioButton76:
            case R.id.radioButton87:
            case R.id.radioButton98:
            case R.id.radioButton109:
                valor = 9;
                break;

            case R.id.radioButton11:
            case R.id.radioButton77:
            case R.id.radioButton88:
            case R.id.radioButton99:
            case R.id.radioButton110:
                valor = 10;
                break;

            case R.id.radioButtonSim:
                valor = 1;
                break;

            case R.id.radioButtonNao:
                valor = 0;
                break;
        }

        setaInfoProp(radioGroupId, valor);
    }

    public void setaInfoProp(int radioGroupId, byte valor)
    {
        switch(radioGroupId)
        {
            case R.id.radioGroup2:
                inforDor.setIntensidadeDor(valor);
                break;

            case R.id.radioGroup3:
                inforDor.setAnsioso(valor);
                break;

            case R.id.radioGroup4:
                inforDor.setDeprimido(valor);
                break;

            case R.id.radioGroup5:
                inforDor.setCansado(valor);
                break;

            case R.id.radioGroup6:
                inforDor.setDormir(valor);
                break;

            case R.id.radioGroup7:
                inforDor.setExercicio(valor == 1);
                break;
        }
    }

    public void setRemedioAndObs(String remedios, String obs)
    {
        inforDor.setRemediosDor(remedios);
        inforDor.setObs(obs);
    }

    public String retornaMensagem()
    {
        String mensagem = "";
        Paciente paciente = lerInfoPaciente();

        mensagem += "Paciente: " + paciente.getNome() + "\n\n";

        mensagem += "Partes do Corpo que estão doendo: \n";
        for(ParteCorpo p :partesCorpo)
        {
            mensagem += p.getNome() +"\n";
        }

        mensagem += "\n";

        mensagem += "Intensidade da dor: " + inforDor.getIntensidadeDor() + "\n";
        mensagem += "Nível de ansiedade: " + inforDor.getAnsioso() + "\n";
        mensagem += "Nível de depressão: " + inforDor.getDeprimido() + "\n";
        mensagem += "Nível de cansaço: " + inforDor.getCansado() + "\n";
        mensagem += "Qualidade do sono: " + inforDor.getDormir() + "\n";
        mensagem += "Se exercitou: " + (inforDor.isExercicio() ? "Sim":"Não") + "\n";

        mensagem += "\n";

        mensagem += "Lista de remédios tomados: " + inforDor.getRemediosDor() + "\n";
        mensagem += "\n";
        mensagem += "Obersavações: " + inforDor.getObs() + "\n";

        return mensagem;
    }

    public String retornaAssunto()
    {
        Calendar c = Calendar.getInstance();
        Paciente p = lerInfoPaciente();

        return "Exame: " + p.getNome() +
                " - "+ c.get(Calendar.DAY_OF_MONTH)+
                "/" + (c.get(Calendar.MONTH)+1) +
                "/" + c.get(Calendar.YEAR) +
                " - " + c.get(Calendar.HOUR) +
                ":" + c.get(Calendar.MINUTE);
    }

    public Paciente lerInfoPaciente()
    {
        Paciente p = null;
        try
        {
            FileManagement fileManagement = new FileManagement();
            String paciente = fileManagement.lerInfoPaciente();

            p = new Gson().fromJson(paciente, Paciente.class);
        }
        catch(FileNotFoundException e)
        {
            ShowInformation.showToast("Você ainda não possui arquivo de paciente, por favor crie um", Context);
        }
        catch(IOException e)
        {
            ShowInformation.showToast("Houve um erro ao ler as informações", Context);
        }
        catch(Exception e)
        {
            ShowInformation.showToast(e.getMessage(), Context);
        }

        return p;
    }

    public void gravar()
    {
        Diario d = new Diario(inforDor, partesCorpo, lerInfoPaciente().getId());

        try
        {
            new FileManagement().salvarDiario(d);
        }
        catch(IOException e)
        {
            ShowInformation.showToast("Erro ao gravar diário", Context);
        }

        RequisitionTask.enviarRequisicao(new RequisitionTask.OnRequisitionEnd()
        {
            @Override
            public void onRequisitionEnd(String json, int status, Exception e)
            {
                if(e == null)
                {
                    if(json != null)
                    {
                        if(status == 200)
                        {
                            if(json.equals("true"))
                                ShowInformation.showToast("Registrado com sucesso", Context);
                        }
                    }
                }
                else
                {
                    if(e instanceof UnknownHostException)
                    {
                        new Handler(Context.getMainLooper()).post(new Runnable()
                        {
                            @Override
                            public void run()
                            {
                                ShowInformation.showToast("Sem conexão de internet, diário será gravado no seu celular", Context);
                            }
                        });
                    }
                }
            }
        }, URLs.localhost + "diario/create.php", "POST", d, Context);
    }
}
