package microlab.encb.com.microlab.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import microlab.encb.com.microlab.R;
import microlab.encb.com.microlab.ui.samples.SamplesFragment;

/**
 * Created by Gerardo on 16/08/2017.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return super.isViewFromObject(view, object);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment selectedFragment;

        switch (position) {
            default:
                selectedFragment = new SamplesFragment();
        }
        return selectedFragment;
    }


    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {
            case 0:
                title = "Products";
                break;
            case 1:
                title = "Customer";
                break;
            case 2:
                title = "Shopping Cart";
                break;

        }
        return title;
    }
}
