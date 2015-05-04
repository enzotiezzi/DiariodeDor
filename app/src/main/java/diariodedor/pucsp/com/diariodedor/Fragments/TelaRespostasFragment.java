package diariodedor.pucsp.com.diariodedor.Fragments;

import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.google.gson.Gson;

import java.text.ParseException;
import java.util.Arrays;

import diariodedor.pucsp.com.diariodedor.Controller.TelaCorpoController;
import diariodedor.pucsp.com.diariodedor.Model.ParteCorpo;
import diariodedor.pucsp.com.diariodedor.R;


/**
 * A placeholder fragment containing a simple view.
 */
public class TelaRespostasFragment extends Fragment
{
    // Controllers
    private TelaCorpoController telaCorpoController;

    // Views
    private View v;

    // RadioGroups
    private RadioGroup radioGroup2;
    private RadioGroup radioGroup3;
    private RadioGroup radioGroup4;
    private RadioGroup radioGroup5;
    private RadioGroup radioGroup6;
    private RadioGroup radioGroup7;

    public TelaRespostasFragment()
    {
    }

    public void initialize()
    {
        // RadioGroups
        radioGroup2 = (RadioGroup)v.findViewById(R.id.radioGroup2);
        radioGroup2.setOnCheckedChangeListener(checkedChangeListener);

        radioGroup3 = (RadioGroup)v.findViewById(R.id.radioGroup3);
        radioGroup3.setOnCheckedChangeListener(checkedChangeListener);

        radioGroup4 = (RadioGroup)v.findViewById(R.id.radioGroup4);
        radioGroup4.setOnCheckedChangeListener(checkedChangeListener);

        radioGroup5 = (RadioGroup)v.findViewById(R.id.radioGroup5);
        radioGroup5.setOnCheckedChangeListener(checkedChangeListener);

        radioGroup6 = (RadioGroup)v.findViewById(R.id.radioGroup6);
        radioGroup6.setOnCheckedChangeListener(checkedChangeListener);

        radioGroup7 = (RadioGroup)v.findViewById(R.id.radioGroup7);
        radioGroup7.setOnCheckedChangeListener(checkedChangeListener);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        v =  inflater.inflate(R.layout.fragment_tela_respostas, container, false);

        initialize();

        telaCorpoController = new TelaCorpoController(v.getContext());

        ParteCorpo[] partesCorpo = new Gson().fromJson(getArguments().getString("partesCorpo"), ParteCorpo[].class);

        telaCorpoController.addPartesCorpo(Arrays.asList(partesCorpo));

        return v;
    }

    public static TelaRespostasFragment newInstance()
    {
        TelaRespostasFragment fragment = new TelaRespostasFragment();
        return fragment;
    }

    RadioGroup.OnCheckedChangeListener checkedChangeListener = new RadioGroup.OnCheckedChangeListener()
    {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId)
        {

        }
    };
}
