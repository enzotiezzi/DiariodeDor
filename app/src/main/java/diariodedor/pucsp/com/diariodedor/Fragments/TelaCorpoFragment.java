package diariodedor.pucsp.com.diariodedor.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.google.gson.Gson;

import diariodedor.pucsp.com.diariodedor.Controller.TelaCorpoController;
import diariodedor.pucsp.com.diariodedor.R;
import diariodedor.pucsp.com.diariodedor.Util.ShowInformation;

public class TelaCorpoFragment extends android.support.v4.app.Fragment
{
    //Controllers
    TelaCorpoController telaCorpoController;

    //Views
    private View v;

    //Buttons
    private Button buttonGravar;

    //CheckBoxes
    //Rosto
    private CheckBox checkBoxRosto;

    //Mandibula
    private CheckBox checkBoxMandibulaEsq;
    private CheckBox checkBoxMandibulaDir;

    //Pescoco
    private CheckBox checkBoxPescoco;

    //Ombros
    private CheckBox checkBoxOmbroEsq;
    private CheckBox checkBoxOmbroDir;

    //Peito
    private CheckBox checkBoxTorax;

    //Bracos
    private CheckBox checkBoxBracoEsq;
    private CheckBox checkBoxBracoDir;

    //Cotovelos
    private CheckBox checkBoxCotoveloEsq;
    private CheckBox checkBoxCotoveloDir;

    //Antebracos
    private CheckBox checkBoxAnteBracoEsq;
    private CheckBox checkBoxAnteBracoDir;

    //Maos
    private CheckBox checkBoxMaoEsq;
    private CheckBox checkBoxMaoDir;

    //Abdomen
    private CheckBox checkBoxAbdomen;

    //Cinturas
    private CheckBox checkBoxQuadrilEsq;
    private CheckBox checkBoxQuadrilDir;

    //Coxas
    private CheckBox checkBoxCoxaEsq;
    private CheckBox checkBoxCoxaDir;

    //Joelhos
    private CheckBox checkBoxJoelhoEsq;
    private CheckBox checkBoxJoelhoDir;

    //Panturrilhas
    private CheckBox checkBoxPernaEsq;
    private CheckBox checkBoxPernaDir;

    //Pes e Tornozelo
    private CheckBox checkBoxPeEsq;
    private CheckBox checkBoxPeDir;

    public TelaCorpoFragment()
    {
    }

    public static TelaCorpoFragment newInstance()
    {
        TelaCorpoFragment fragment = new TelaCorpoFragment();
        return fragment;
    }

    public void initialize()
    {
        //Button Gravar
        buttonGravar = (Button)v.findViewById(R.id.buttonGravar);
        buttonGravar.setOnClickListener(buttonGravar_Click);

        // Rosto
        checkBoxRosto = (CheckBox)v.findViewById(R.id.checkBoxRosto);
        checkBoxRosto.setOnCheckedChangeListener(checkBox_CheckedChanges);

        // Maxilar
        checkBoxMandibulaEsq = (CheckBox)v.findViewById(R.id.checkBoxMandibulaEsq);
        checkBoxMandibulaEsq.setOnCheckedChangeListener(checkBox_CheckedChanges);

        checkBoxMandibulaDir = (CheckBox)v.findViewById(R.id.checkBoxMandibulaDir);
        checkBoxMandibulaDir.setOnCheckedChangeListener(checkBox_CheckedChanges);

        // Pescoco
        checkBoxPescoco = (CheckBox)v.findViewById(R.id.checkBoxPescoco);
        checkBoxPescoco.setOnCheckedChangeListener(checkBox_CheckedChanges);

        // Ombro
        checkBoxOmbroEsq = (CheckBox)v.findViewById(R.id.checkBoxOmbroEsq);
        checkBoxOmbroEsq.setOnCheckedChangeListener(checkBox_CheckedChanges);

        checkBoxOmbroDir = (CheckBox)v.findViewById(R.id.checkBoxOmbroDir);
        checkBoxOmbroDir.setOnCheckedChangeListener(checkBox_CheckedChanges);

        // Peito
        checkBoxTorax = (CheckBox)v.findViewById(R.id.checkBoxTorax);
        checkBoxTorax.setOnCheckedChangeListener(checkBox_CheckedChanges);

        // Braco
        checkBoxBracoEsq = (CheckBox)v.findViewById(R.id.checkBoxBracoEsq);
        checkBoxBracoEsq.setOnCheckedChangeListener(checkBox_CheckedChanges);

        checkBoxBracoDir = (CheckBox)v.findViewById(R.id.checkBoxBracoDir);
        checkBoxBracoDir.setOnCheckedChangeListener(checkBox_CheckedChanges);

        // Cotovelo
        checkBoxCotoveloEsq = (CheckBox)v.findViewById(R.id.checkBoxCotoveloEsq);
        checkBoxCotoveloEsq.setOnCheckedChangeListener(checkBox_CheckedChanges);

        checkBoxCotoveloDir = (CheckBox)v.findViewById(R.id.checkBoxCotoveloDir);
        checkBoxCotoveloDir.setOnCheckedChangeListener(checkBox_CheckedChanges);

        // Antebraco
        checkBoxAnteBracoEsq = (CheckBox)v.findViewById(R.id.checkBoxAnteBracoEsq);
        checkBoxAnteBracoEsq.setOnCheckedChangeListener(checkBox_CheckedChanges);

        checkBoxAnteBracoDir = (CheckBox)v.findViewById(R.id.checkBoxAnteBracoDir);
        checkBoxAnteBracoDir.setOnCheckedChangeListener(checkBox_CheckedChanges);

        // Mao
        checkBoxMaoEsq = (CheckBox)v.findViewById(R.id.checkBoxMaoEsq);
        checkBoxMaoEsq.setOnCheckedChangeListener(checkBox_CheckedChanges);

        checkBoxMaoDir = (CheckBox)v.findViewById(R.id.checkBoxMaoDir);
        checkBoxMaoDir.setOnCheckedChangeListener(checkBox_CheckedChanges);

        // Abdomen
        checkBoxAbdomen = (CheckBox)v.findViewById(R.id.checkBoxAbdomen);
        checkBoxAbdomen.setOnCheckedChangeListener(checkBox_CheckedChanges);

        // Cintura
        checkBoxQuadrilEsq = (CheckBox)v.findViewById(R.id.checkBoxQuadrilEsq);
        checkBoxQuadrilEsq.setOnCheckedChangeListener(checkBox_CheckedChanges);

        checkBoxQuadrilDir = (CheckBox)v.findViewById(R.id.checkBoxQuadrilDir);
        checkBoxQuadrilDir.setOnCheckedChangeListener(checkBox_CheckedChanges);

        // Coxa
        checkBoxCoxaEsq = (CheckBox)v.findViewById(R.id.checkBoxCoxaEsq);
        checkBoxCoxaEsq.setOnCheckedChangeListener(checkBox_CheckedChanges);

        checkBoxCoxaDir = (CheckBox)v.findViewById(R.id.checkBoxCoxaDir);
        checkBoxCoxaDir.setOnCheckedChangeListener(checkBox_CheckedChanges);

        // Joelho
        checkBoxJoelhoEsq = (CheckBox)v.findViewById(R.id.checkBoxJoelhoEsq);
        checkBoxJoelhoEsq.setOnCheckedChangeListener(checkBox_CheckedChanges);

        checkBoxJoelhoDir = (CheckBox)v.findViewById(R.id.checkBoxJoelhoDir);
        checkBoxJoelhoDir.setOnCheckedChangeListener(checkBox_CheckedChanges);

        // Panturrilha
        checkBoxPernaEsq = (CheckBox)v.findViewById(R.id.checkBoxPernaEsq);
        checkBoxPernaEsq.setOnCheckedChangeListener(checkBox_CheckedChanges);

        checkBoxPernaDir = (CheckBox)v.findViewById(R.id.checkBoxPernaDir);
        checkBoxPernaDir.setOnCheckedChangeListener(checkBox_CheckedChanges);

        // ??

        // Pe
        checkBoxPeEsq = (CheckBox)v.findViewById(R.id.checkBoxPeEsq);
        checkBoxPeEsq.setOnCheckedChangeListener(checkBox_CheckedChanges);

        checkBoxPeDir = (CheckBox)v.findViewById(R.id.checkBoxPeDir);
        checkBoxPeDir.setOnCheckedChangeListener(checkBox_CheckedChanges);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        v =  inflater.inflate(R.layout.fragment_tela_corpo, container, false);

        initialize();

        telaCorpoController = new TelaCorpoController(v.getContext());

        return v;
    }

    View.OnClickListener buttonGravar_Click = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            Fragment fragment = TelaCostasFragment.newInstance();

            Bundle bundle = new Bundle();

            bundle.putString("partesCorpo", new Gson().toJson(telaCorpoController.getPartesCorpo()));

            fragment.setArguments(bundle);

            getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, fragment)
                    .commit();
        }
    };

    CompoundButton.OnCheckedChangeListener checkBox_CheckedChanges = new CompoundButton.OnCheckedChangeListener()
    {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
        {
            telaCorpoController.adicionaRemoveParteCorpo(buttonView.getId(), isChecked);
        }
    };
}
