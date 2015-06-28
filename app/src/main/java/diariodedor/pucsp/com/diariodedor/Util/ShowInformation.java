package diariodedor.pucsp.com.diariodedor.Util;

import android.app.AlertDialog;
import android.content.Context;
import android.widget.Toast;

import java.util.logging.Handler;

/**
 * Created by enzo on 02/05/2015.
 */
public class ShowInformation
{
    public static void showToast(String mensagem, Context context)
    {
        Toast.makeText(context, mensagem, Toast.LENGTH_LONG).show();
    }

    public static void showDialog(String mensagem, Context context)
    {
        new AlertDialog.Builder(context)
                .setTitle("Atenção!!")
                .setMessage(mensagem)
                .setNeutralButton("Ok", null)
                .show();
    }
}
