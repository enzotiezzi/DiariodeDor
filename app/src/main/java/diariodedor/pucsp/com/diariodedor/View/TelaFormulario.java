package diariodedor.pucsp.com.diariodedor.View;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import diariodedor.pucsp.com.diariodedor.Fragments.TelaCorpoFragment;
import diariodedor.pucsp.com.diariodedor.Fragments.TelaFormularioFragment;
import diariodedor.pucsp.com.diariodedor.Fragments.TelaListaDiarioFragment;
import diariodedor.pucsp.com.diariodedor.Fragments.TelaRespostasFragment;
import diariodedor.pucsp.com.diariodedor.R;
import diariodedor.pucsp.com.diariodedor.Util.NavigationDrawerFragment;


public class TelaFormulario extends ActionBarActivity implements NavigationDrawerFragment.NavigationDrawerCallbacks
{

    private NavigationDrawerFragment mNavigationDrawerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_formulario);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);

        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));
    }


    @Override
    public void onNavigationDrawerItemSelected(int position)
    {
        // update the main content by replacing fragments
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = null;

        switch (position)
        {
            case 0:
                fragment = TelaFormularioFragment.newInstance();
                break;

            case 1:
                fragment = TelaCorpoFragment.newInstance();
                break;

            case 2:
                fragment = TelaListaDiarioFragment.newInstance();
                break;

            default:
                fragment = TelaFormularioFragment.newInstance();
                break;
        }

        fragmentManager.beginTransaction()
                .replace(R.id.container, fragment)
                .commit();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_tela_formulario, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        return super.onOptionsItemSelected(item);
    }
}
