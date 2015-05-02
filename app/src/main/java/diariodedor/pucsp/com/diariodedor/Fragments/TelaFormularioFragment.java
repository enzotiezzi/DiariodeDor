package diariodedor.pucsp.com.diariodedor.Fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import diariodedor.pucsp.com.diariodedor.R;


/**
 * A placeholder fragment containing a simple view.
 */
public class TelaFormularioFragment extends Fragment
{
    private View v;

    private EditText editTextNome;

    public TelaFormularioFragment()
    {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        v =  inflater.inflate(R.layout.fragment_tela_formulario, container, false);

        editTextNome = (EditText)v.findViewById(R.id.editTextNome);

        return v;
    }

    public static TelaFormularioFragment newInstance()
    {
        TelaFormularioFragment fragment = new TelaFormularioFragment();
        return fragment;
    }
}
