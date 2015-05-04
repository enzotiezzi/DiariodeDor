package diariodedor.pucsp.com.diariodedor.Util;

import android.content.Context;
import android.content.Intent;

/**
 * Created by enzo on 04/05/2015.
 */
public class EmailManagement
{
    private Context Context;
    private String Subject;
    private String To;
    private String Mensagem;

    public EmailManagement(String subject, String to, String mensagem, Context context)
    {
        this.Subject = subject;
        this.To = to;
        this.Mensagem = mensagem;
        this.Context = context;
    }

    public void enviarEmail()
    {
        Intent i = new Intent(Intent.ACTION_SEND);

        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{To});
        i.putExtra(Intent.EXTRA_SUBJECT, Subject);
        i.putExtra(Intent.EXTRA_TEXT, Mensagem);

        Context.startActivity(Intent.createChooser(i, "Enviando Email..."));
    }
}
