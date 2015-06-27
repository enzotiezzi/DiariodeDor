package diariodedor.pucsp.com.diariodedor.Fragments;

import android.os.Handler;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.gson.Gson;

import java.net.UnknownHostException;
import java.util.List;

import diariodedor.pucsp.com.diariodedor.Controller.TelaCorpoController;
import diariodedor.pucsp.com.diariodedor.Model.Diario;
import diariodedor.pucsp.com.diariodedor.R;
import diariodedor.pucsp.com.diariodedor.Requisition.RequisitionTask;
import diariodedor.pucsp.com.diariodedor.Requisition.URLs;
import diariodedor.pucsp.com.diariodedor.Util.ShowInformation;


/**
 * A placeholder fragment containing a simple view.
 */
public class TelaListaDiarioFragment extends Fragment
{
    private View v;

    private ListView listViewDiario;

    private Diario[] diarios;

    public TelaListaDiarioFragment()
    {
    }

    public static TelaListaDiarioFragment newInstance()
    {
        return new TelaListaDiarioFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        v =  inflater.inflate(R.layout.fragment_tela_lista_diario, container, false);

        listViewDiario = (ListView)v.findViewById(R.id.listViewDiario);

        int id = new TelaCorpoController(getActivity()).lerInfoPaciente().getId();
        RequisitionTask.enviarRequisicao(new RequisitionTask.OnRequisitionEnd()
        {
            @Override
            public void onRequisitionEnd(String json, int status, Exception e)
            {
                if(e == null)
                {
                    if (status == 200)
                    {
                        diarios = new Gson().fromJson(json, Diario[].class);
                        listViewDiario.setAdapter(new ArrayAdapter<Diario>(getActivity(), android.R.layout.simple_list_item_1, diarios));
                    }
                }
                else
                {
                    if(e instanceof UnknownHostException)
                    {
                        new Handler(getActivity().getMainLooper()).post(new Runnable()
                        {
                            @Override
                            public void run()
                            {
                                ShowInformation.showToast("Sem conexão de internet", getActivity());
                            }
                        });
                    }
                }
            }
        }, URLs.localhost + "/diario/list.php?id=" + id, "GET", null, getActivity());

        return v;
    }
}
