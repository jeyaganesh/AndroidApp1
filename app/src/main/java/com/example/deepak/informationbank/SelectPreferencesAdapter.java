package com.example.deepak.informationbank;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by deepak on 4/4/17.
 */

public class SelectPreferencesAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public SelectPreferencesAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                SelectPreferencesEducationTabFragment tab1 = new SelectPreferencesEducationTabFragment();
                return tab1;
            case 1:
               SelectPreferencesExamsTabFragment tab2 = new SelectPreferencesExamsTabFragment ();
                return tab2;
            case 2:
                SelectPreferencesOthersTabFragment tab3 = new SelectPreferencesOthersTabFragment();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
