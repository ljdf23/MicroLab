package microlab.encb.com.microlab;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import devlight.io.library.ntb.NavigationTabBar;
import microlab.encb.com.microlab.adapters.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ViewPagerAdapter mViewPagerAdapter;
    @BindView(R.id.vp_horizontal_ntb)
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        ButterKnife.bind(this);

        UIInit();
    }

    private void UIInit() {

        final String[] colors = getResources().getStringArray(R.array.nav_colors);

        final NavigationTabBar navigationTabBar = (NavigationTabBar) findViewById(R.id.ntb_horizontal);
        final ArrayList<NavigationTabBar.Model> models = new ArrayList<>();
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.mis_muestras_unselected),
                        Color.parseColor(colors[0]))
                        .selectedIcon(getResources().getDrawable(R.drawable.mis_muestras_selected))
                        .title(getString(R.string.mis_muestras))
                        .badgeTitle("NTB")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.mi_historial_unselected),
                        Color.parseColor(colors[1]))
                        .selectedIcon(getResources().getDrawable(R.drawable.mi_historial_selected
                        ))
                        .title(getString(R.string.mi_historial))
                        .badgeTitle("with")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.contacto_unselected),
                        Color.parseColor(colors[2]))
                        .selectedIcon(getResources().getDrawable(R.drawable.contacto_selected))
                        .title(getString(R.string.contacto))
                        .badgeTitle("state")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.conocenos_unselected),
                        Color.parseColor(colors[3]))
                        .selectedIcon(getResources().getDrawable(R.drawable.conocenos_selected))
                        .title(getString(R.string.conocenos))
                        .badgeTitle("icon")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.mi_cuenta_unselected),
                        Color.parseColor(colors[4]))
                        .selectedIcon(getResources().getDrawable(R.drawable.mi_cuenta_selected))
                        .title(getString(R.string.mi_cuenta))
                        .badgeTitle("777")
                        .build()
        );

        navigationTabBar.setModels(models);
        mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        final ViewPager viewPager = findViewById(R.id.vp_horizontal_ntb);
        viewPager.setAdapter(mViewPagerAdapter);

        navigationTabBar.setViewPager(mViewPager, 0);
        navigationTabBar.setTitleMode(NavigationTabBar.TitleMode.ALL);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
