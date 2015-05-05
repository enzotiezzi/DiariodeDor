package diariodedor.pucsp.com.diariodedor.Fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import diariodedor.pucsp.com.diariodedor.Controller.TelaCorpoController;
import diariodedor.pucsp.com.diariodedor.Controller.TelaFormularioController;
import diariodedor.pucsp.com.diariodedor.Model.Paciente;
import diariodedor.pucsp.com.diariodedor.R;


/**
 * A placeholder fragment containing a simple view.
 */
public class TelaFormularioFragment extends Fragment
{

    // Controllers
    private TelaCorpoController telaCorpoController;

    // Views
    private View v;

    // EditTexts
    private EditText editTextNome;
    private EditText editTextProfissao;
    private EditText editTextEscolaridade;
    private EditText editTextDiagnostico;
    private EditText editTextTempoDoenca;
    private EditText editTextMelhorHorario;
    private EditText editTextEmail;

    //Buttons
    private Button buttonGravar;

    public TelaFormularioFragment()
    {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        v =  inflater.inflate(R.layout.fragment_tela_formulario, container, false);

        initialize();

        telaCorpoController = new TelaCorpoController(v.getContext());

        carregarPaciente();

        return v;
    }

    public static TelaFormularioFragment newInstance()
    {
        TelaFormularioFragment fragment = new TelaFormularioFragment();
        return fragment;
    }

    public void carregarPaciente()
    {
        Paciente p = telaCorpoController.lerInfoPaciente();

        if (p != null)
        {
            editTextNome.setText(p.getNome());
            editTextProfissao.setText(p.getProfissao());
            editTextEscolaridade.setText(p.getEscolaridade());
            editTextDiagnostico.setText(p.getDiagnostico());
            editTextTempoDoenca.setText(p.getTempoDoenca());
            editTextMelhorHorario.setText(p.getMelhorHorario());
            editTextEmail.setText(p.getEmailMedico());
        }
    }

    public void initialize()
    {
        // Nome
        editTextNome = (EditText)v.findViewById(R.id.editTextNome);

        // Profissao
        editTextProfissao = (EditText)v.findViewById(R.id.editTextProfissao);

        // Escolaridade
        editTextEscolaridade = (EditText)v.findViewById(R.id.editTextEscolaridade);

        // Diagnostico
        editTextDiagnostico = (EditText)v.findViewById(R.id.editTextDiagnostico);

        // Tempo da doenca
        editTextTempoDoenca = (EditText)v.findViewById(R.id.editTextTempoDoenca);

        // Melhor horario
        editTextMelhorHorario = (EditText)v.findViewById(R.id.editTextMelhorHorario);

        // Email medico
        editTextEmail = (EditText)v.findViewById(R.id.editTextEmail);

        // Button Gravar
        buttonGravar = (Button)v.findViewById(R.id.buttonGravar);
        buttonGravar.setOnClickListener(buttonGravar_Click);
    }


    View.OnClickListener buttonGravar_Click = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            TelaFormularioController telaFormularioController = new TelaFormularioController(v.getContext());

            telaFormularioController.salvarInfoPaciente
                    (
                            editTextNome.getText().toString(),
                            editTextProfissao.getText().toString(),
                            editTextEscolaridade.getText().toString(),
                            editTextDiagnostico.getText().toString(),
                            editTextTempoDoenca.getText().toString(),
                            editTextMelhorHorario.getText().toString(),
                            editTextEmail.getText().toString()
                    );
        }
    };

}
