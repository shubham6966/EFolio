package com.deepbench.eventfolio.efolio;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by tarun on 19/10/17.
 */

public class SimplePagerFragmentAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] { "Events", "Notifications"};

    public SimplePagerFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EventsFragment();
        } else {
            return new NotificationFragment();
        }

    }

    @Override
    public int getCount() {
        return 2;
    }
}
