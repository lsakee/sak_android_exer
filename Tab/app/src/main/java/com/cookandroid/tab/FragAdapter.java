package com.cookandroid.tab;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class FragAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> fragList=new ArrayList<>();

    public FragAdapter(@NonNull FragmentManager fm) {
        super(fm);
        fragList.add(new Frag1());
        fragList.add(new Frag2());
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragList.get(position);
    }

    @Override
    public int getCount() {
        return fragList.size();
    }
}
