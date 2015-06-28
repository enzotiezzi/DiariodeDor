package diariodedor.pucsp.com.diariodedor;

import android.sax.TextElementListener;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.gson.Gson;

import diariodedor.pucsp.com.diariodedor.Model.Diario;
import diariodedor.pucsp.com.diariodedor.Model.ParteCorpo;


/**
 * A placeholder fragment containing a simple view.
 */
public class TelaDiarioDetalhesFragment extends Fragment
{
    private View v;

    private TextView textViewDia;
    private TextView textViewDor;
    private TextView textViewAnsiedade;
    private TextView textViewDeprimido;
    private TextView textViewCansaco;
    private TextView textViewDormir;
    private TextView textViewExercicio;
    private TextView textViewObs;
    private TextView textViewRemedios;
    private TextView textViewPartes;

    public TelaDiarioDetalhesFragment()
    {
    }

    public void initialize()
    {
        textViewDia = (TextView)v.findViewById(R.id.textViewDia);
        textViewDor = (TextView)v.findViewById(R.id.textViewDor);
        textViewAnsiedade = (TextView)v.findViewById(R.id.textViewAnsiedade);
        textViewDeprimido = (TextView)v.findViewById(R.id.textViewDeprimido);
        textViewCansaco = (TextView)v.findViewById(R.id.textViewCansaco);
        textViewDormir = (TextView)v.findViewById(R.id.textViewDormir);
        textViewExercicio = (TextView)v.findViewById(R.id.textViewExercicio);
        textViewObs = (TextView)v.findViewById(R.id.textViewObs);
        textViewRemedios = (TextView)v.findViewById(R.id.textViewRemedio);
        textViewPartes = (TextView)v.findViewById(R.id.textViewPartes);
    }

    public static TelaDiarioDetalhesFragment newInstance()
    {
        return new TelaDiarioDetalhesFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        v =  inflater.inflate(R.layout.fragment_tela_diario_detalhes, container, false);

        initialize();

        String json = getArguments().getString("diario");
        Diario d = new Gson().fromJson(json, Diario.class);

        textViewDia.setText(d.toString());
        textViewDor.setText("Intensidade da dor: "+d.getInfoDor().getIntensidadeDor());
        textViewAnsiedade.setText("Ansiedade: "+d.getInfoDor().getAnsioso());
        textViewDeprimido.setText("Deprimido: "+d.getInfoDor().getDeprimido());
        textViewCansaco.setText("Cansaço: "+d.getInfoDor().getCansado());
        textViewDormir.setText("Dormiu mal: "+d.getInfoDor().getDormir());
        textViewExercicio.setText("Fez Exercício: "+(d.getInfoDor().isExercicio() ? "Sim" : "Não"));
        textViewObs.setText("Observações: "+d.getInfoDor().getObs());
        textViewRemedios.setText("Remédios: "+d.getInfoDor().getRemediosDor());

        String partes = "";

        for (ParteCorpo p : d.getPartesCorpo())
            partes+= p.getNome()+", ";

        textViewPartes.setText("Partes com dor: "+partes);

        return v;
    }
}
