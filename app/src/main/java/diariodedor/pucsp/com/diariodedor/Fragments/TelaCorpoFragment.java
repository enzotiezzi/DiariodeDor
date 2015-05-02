package diariodedor.pucsp.com.diariodedor.Fragments;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import diariodedor.pucsp.com.diariodedor.R;

public class TelaCorpoFragment extends android.support.v4.app.Fragment
{
    private View v;

    public TelaCorpoFragment()
    {
    }

    public static TelaCorpoFragment newInstance()
    {
        TelaCorpoFragment fragment = new TelaCorpoFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        v =  inflater.inflate(R.layout.fragment_tela_corpo, container, false);

        return v;
    }
}
