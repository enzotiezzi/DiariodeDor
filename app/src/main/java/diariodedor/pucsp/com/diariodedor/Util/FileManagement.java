package diariodedor.pucsp.com.diariodedor.Util;

import android.os.Environment;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import diariodedor.pucsp.com.diariodedor.Model.Paciente;

/**
 * Created by enzo on 02/05/2015.
 */
public class FileManagement
{
    private final File STORAGE_PATH = Environment.getExternalStorageDirectory();

    private final String PACIENTE_PATH = "User/";
    private final String ENVIADOS_PATH = "Sended/";
    private final String ESPERA_PATH = "Await/";
    private final String PACIENTE_ARQUIVO = "paciente.txt";


    public FileManagement()
    {}

    public void salvarInfoPaciente(Paciente p) throws IOException
    {
        criarPastaInfoPaciente();
        File infos = criarArquivoInfoPaciente();
        escreverInfoPaciente(infos, p);
    }

    private void criarPastaInfoPaciente()
    {
        File folder = new File(STORAGE_PATH, PACIENTE_PATH);

        if(!folder.exists())
        {
            folder.mkdir();
        }
    }

    private File criarArquivoInfoPaciente() throws IOException
    {
        File file = new File(new File(STORAGE_PATH, PACIENTE_PATH), PACIENTE_ARQUIVO);

        if(!file.exists())
        {
            file.createNewFile();
        }
        else
        {
            file.delete();
            file.createNewFile();
        }

        return file;
    }

    private void escreverInfoPaciente(File infos, Paciente p) throws IOException
    {

        String infomacoes = new Gson().toJson(p);

        escreverArquivo(infos, infomacoes);
    }

    private void escreverArquivo(File infos, String conteudo) throws IOException
    {

        FileWriter fileWriter = new FileWriter(infos, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.append(conteudo);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    private String lerArquivo(File arquivo) throws IOException
    {
        String linha = "";
        StringBuilder stringBuilder = new StringBuilder();

        if (arquivo.exists())
        {
            FileReader fileReader = new FileReader(arquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((linha = bufferedReader.readLine()) != null)
                stringBuilder.append(linha);

            bufferedReader.close();
        }

        return stringBuilder.toString();
    }

    public String lerInfoPaciente() throws IOException
    {
        return lerArquivo(new File(new File(STORAGE_PATH, PACIENTE_PATH), PACIENTE_ARQUIVO));
    }
}
