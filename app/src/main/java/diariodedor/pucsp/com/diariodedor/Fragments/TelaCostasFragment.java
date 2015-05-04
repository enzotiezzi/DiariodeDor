package diariodedor.pucsp.com.diariodedor.Fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;

import diariodedor.pucsp.com.diariodedor.Controller.TelaCorpoController;
import diariodedor.pucsp.com.diariodedor.Model.ParteCorpo;
import diariodedor.pucsp.com.diariodedor.R;


/**
 * A placeholder fragment containing a simple view.
 */
public class TelaCostasFragment extends Fragment
{

    // Controllers
    TelaCorpoController telaCorpoController;

    // Views
    View v;

    // Buttons
    private Button buttonGravar;

    // Pescoco
    private CheckBox checkBoxCostasPescoco;

    // Ombros
    private CheckBox checkBoxCostasOmbroEsq;
    private CheckBox checkBoxCostasOmbroDir;

    // Bracos
    private CheckBox checkBoxCostasBracoEsq;
    private CheckBox checkBoxCostasBracoDir;

    // Cotovelos
    private CheckBox checkBoxCostasCotoveloEsq;
    private CheckBox checkBoxCostasCotoveloDir;

    // Antebraco
    private CheckBox checkBoxCostasAntebracoEsq;
    private CheckBox checkBoxCostasAntebracoDir;

    // Punhos e maos
    private CheckBox checkBoxCostasMaoEsq;
    private CheckBox checkBoxCostasMaoDir;

    // Quadril
    private CheckBox checkBoxCostasQuadrilEsq;
    private CheckBox checkBoxCostasQuadrilDir;

    // Coxa
    private CheckBox checkBoxCostasCoxaEsq;
    private CheckBox checkBoxCostasCoxaDir;

    // Joelhos
    private CheckBox checkBoxCostasJoelhoEsq;
    private CheckBox checkBoxCostasJoelhoDir;

    // Pernas
    private CheckBox checkBoxCostasPernaEsq;
    private CheckBox checkBoxCostasPernaDir;

    // Pes e Tornozelos
    private CheckBox checkBoxCostasPeEsq;
    private CheckBox checkBoxCostasPeDir;

    // Costas
    private CheckBox checkBoxCostas;

    // Lombar
    private CheckBox checkBoxCostasLombar;


    public TelaCostasFragment()
    {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        v =  inflater.inflate(R.layout.fragment_tela_costas, container, false);

        initialize();
        telaCorpoController = new TelaCorpoController(v.getContext());

        if(getArguments() != null)
        {
            ParteCorpo[] partesCorpo = new Gson().fromJson(getArguments().getString("partesCorpo"), ParteCorpo[].class);
            telaCorpoController.addPartesCorpo(Arrays.asList(partesCorpo));
        }
        return v;
    }

    public void initialize()
    {
        // Button Gravar
        buttonGravar = (Button)v.findViewById(R.id.buttonCostasGravar);
        buttonGravar.setOnClickListener(buttonGravar_Click);

        // Pescoco
        checkBoxCostasPescoco = (CheckBox)v.findViewById(R.id.checkBoxCostasPescoco);
        checkBoxCostasPescoco.setOnCheckedChangeListener(checkedChanged);

        // Ombros
        checkBoxCostasOmbroEsq = (CheckBox)v.findViewById(R.id.checkBoxCostasOmbroEsq);
        checkBoxCostasOmbroEsq.setOnCheckedChangeListener(checkedChanged);

        checkBoxCostasOmbroDir = (CheckBox)v.findViewById(R.id.checkBoxCostasOmbroDir);
        checkBoxCostasOmbroDir.setOnCheckedChangeListener(checkedChanged);

        // Bracos
        checkBoxCostasBracoEsq = (CheckBox)v.findViewById(R.id.checkBoxCostasBracoEsq);
        checkBoxCostasBracoEsq.setOnCheckedChangeListener(checkedChanged);

        checkBoxCostasBracoDir = (CheckBox)v.findViewById(R.id.checkBoxCostasBracoDir);
        checkBoxCostasBracoDir.setOnCheckedChangeListener(checkedChanged);

        // Cotovelos
        checkBoxCostasCotoveloEsq = (CheckBox)v.findViewById(R.id.checkBoxCostasCotoveloEsq);
        checkBoxCostasCotoveloEsq.setOnCheckedChangeListener(checkedChanged);

        checkBoxCostasCotoveloDir = (CheckBox)v.findViewById(R.id.checkBoxCostasCotoveloDir);
        checkBoxCostasCotoveloDir.setOnCheckedChangeListener(checkedChanged);

        // Antebracos
        checkBoxCostasAntebracoEsq = (CheckBox)v.findViewById(R.id.checkBoxCostasAntebracoEsq);
        checkBoxCostasAntebracoEsq.setOnCheckedChangeListener(checkedChanged);

        checkBoxCostasAntebracoDir = (CheckBox)v.findViewById(R.id.checkBoxCostasAntebracoDir);
        checkBoxCostasAntebracoDir.setOnCheckedChangeListener(checkedChanged);

        // Punhos e Maos
        checkBoxCostasMaoEsq = (CheckBox)v.findViewById(R.id.checkBoxCostasMaoEsq);
        checkBoxCostasMaoEsq.setOnCheckedChangeListener(checkedChanged);

        checkBoxCostasMaoDir = (CheckBox)v.findViewById(R.id.checkBoxCostasMaoDir);
        checkBoxCostasMaoDir.setOnCheckedChangeListener(checkedChanged);

        // Quadris
        checkBoxCostasQuadrilEsq = (CheckBox)v.findViewById(R.id.checkBoxCostasQuadrilEsq);
        checkBoxCostasQuadrilEsq.setOnCheckedChangeListener(checkedChanged);

        checkBoxCostasQuadrilDir = (CheckBox)v.findViewById(R.id.checkBoxCostasQuadrilDir);
        checkBoxCostasQuadrilDir.setOnCheckedChangeListener(checkedChanged);

        // Coxas
        checkBoxCostasCoxaEsq = (CheckBox)v.findViewById(R.id.checkBoxCostasCoxaEsq);
        checkBoxCostasCoxaEsq.setOnCheckedChangeListener(checkedChanged);

        checkBoxCostasCoxaDir = (CheckBox)v.findViewById(R.id.checkBoxCostasCoxaDir);
        checkBoxCostasCoxaDir.setOnCheckedChangeListener(checkedChanged);

        // Joelhos
        checkBoxCostasJoelhoEsq = (CheckBox)v.findViewById(R.id.checkBoxCostasJoelhoEsq);
        checkBoxCostasJoelhoEsq.setOnCheckedChangeListener(checkedChanged);

        checkBoxCostasJoelhoDir = (CheckBox)v.findViewById(R.id.checkBoxCostasJoelhoDir);
        checkBoxCostasJoelhoDir.setOnCheckedChangeListener(checkedChanged);

        // Pernas
        checkBoxCostasPernaEsq = (CheckBox)v.findViewById(R.id.checkBoxCostasPernaEsq);
        checkBoxCostasPernaEsq.setOnCheckedChangeListener(checkedChanged);

        checkBoxCostasPernaDir = (CheckBox)v.findViewById(R.id.checkBoxCostasPernaDir);
        checkBoxCostasPernaDir.setOnCheckedChangeListener(checkedChanged);

        // Pes e Tornozelos
        checkBoxCostasPeEsq = (CheckBox)v.findViewById(R.id.checkBoxCostasPeEsq);
        checkBoxCostasPeEsq.setOnCheckedChangeListener(checkedChanged);

        checkBoxCostasPeDir = (CheckBox)v.findViewById(R.id.checkBoxCostasPeDir);
        checkBoxCostasPeDir.setOnCheckedChangeListener(checkedChanged);

        // Costas
        checkBoxCostas = (CheckBox)v.findViewById(R.id.checkBoxCostas);
        checkBoxCostas.setOnCheckedChangeListener(checkedChanged);

        // Lombar
        checkBoxCostasLombar = (CheckBox)v.findViewById(R.id.checkBoxCostasLombar);
        checkBoxCostasLombar.setOnCheckedChangeListener(checkedChanged);

    }

    public static TelaCostasFragment newInstance()
    {
        TelaCostasFragment telaCostasFragment = new TelaCostasFragment();
        return telaCostasFragment;
    }

    CompoundButton.OnCheckedChangeListener checkedChanged = new CompoundButton.OnCheckedChangeListener()
    {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
        {
            telaCorpoController.adicionarRemoveParteCostas(buttonView.getId(), isChecked);
        }
    };

    View.OnClickListener buttonGravar_Click = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            Fragment fragment = TelaRespostasFragment.newInstance();

            Bundle bundle = new Bundle();

            bundle.putString("partesCorpo", new Gson().toJson(telaCorpoController.getPartesCorpo()));

            fragment.setArguments(bundle);

            getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, fragment)
                    .commit();
        }
    };
}
