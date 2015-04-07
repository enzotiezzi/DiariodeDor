package diariodedor.pucsp.com.diariodedor.Fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import diariodedor.pucsp.com.diariodedor.R;


/**
 * A placeholder fragment containing a simple view.
 */
public class TelaFormularioFragment extends Fragment
{

    public TelaFormularioFragment()
    {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_tela_formulario, container, false);
    }

    public static TelaFormularioFragment newInstance()
    {
        TelaFormularioFragment fragment = new TelaFormularioFragment();
        return fragment;
    }
}
