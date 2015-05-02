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
public class TelaCostasFragment extends Fragment
{

    public TelaCostasFragment()
    {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_tela_costas, container, false);
    }

    public static TelaCostasFragment newInstance()
    {
        TelaCostasFragment telaCostasFragment = new TelaCostasFragment();
        return telaCostasFragment;
    }
}
