package diariodedor.pucsp.com.diariodedor.View;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;

import diariodedor.pucsp.com.diariodedor.Fragments.TelaFormularioFragment;
import diariodedor.pucsp.com.diariodedor.Fragments.TelaRespostasFragment;
import diariodedor.pucsp.com.diariodedor.R;
import diariodedor.pucsp.com.diariodedor.Util.NavigationDrawerFragment;


public class TelaCorpo extends ActionBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_corpo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }
}
