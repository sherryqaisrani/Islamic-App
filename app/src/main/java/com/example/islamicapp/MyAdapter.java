package com.example.islamicapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends FragmentPagerAdapter {

    public List<Fragment> fragmentList = new ArrayList<>();
    public List<String> tittlelist = new ArrayList<>();
    private Context context;

    public MyAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    public void SwipeFragment(Fragment fragment, String tittle) {

        fragmentList.add(fragment);
        tittlelist.add(tittle);



    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tittlelist.get(position);
    }
}
