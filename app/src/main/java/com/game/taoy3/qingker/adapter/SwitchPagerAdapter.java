package com.game.taoy3.qingker.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by taoy3 on 16/4/9.
 */
public class SwitchPagerAdapter extends FragmentPagerAdapter{
    private Fragment[] fragments;

    public SwitchPagerAdapter(FragmentManager fm,Fragment[] fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }
}
