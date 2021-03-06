package com.example.catwong.tita.adapter;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.catwong.tita.activity.HomeActivity;
import com.example.catwong.tita.fragment.CalendarFragment;
import com.example.catwong.tita.fragment.FindingFragment;
import com.example.catwong.tita.fragment.GoalsFragment;
import com.example.catwong.tita.fragment.UserFragment;

/**
 * Created by LENOVO on 2017/9/23.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {
    private HomeActivity homeActivity;
    private final int PAGE_COUNT = 4;

    private String tabTitles[] = new String[] {"Calendar", "Finding", "Goals", "User"};

    private CalendarFragment fragment0;
    private FindingFragment fragment1;
    private GoalsFragment fragment2;
    private UserFragment fragment3;


    public MyPagerAdapter(FragmentManager fm, HomeActivity homeActivity) {
        super(fm);
        this.homeActivity = homeActivity;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            if (fragment0 == null) fragment0 = new CalendarFragment(homeActivity);
            return fragment0;
        } else if (position == 1) {
            if (fragment1 == null) fragment1 = new FindingFragment(homeActivity);
            return fragment1;
        } else if (position == 2) {
            if (fragment2 == null) fragment2 = new GoalsFragment(homeActivity);
            return fragment2;
        } else if (position == 3) {
            if (fragment3 == null) fragment3 = new UserFragment(homeActivity);
            return fragment3;
        }

        return null;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

}
