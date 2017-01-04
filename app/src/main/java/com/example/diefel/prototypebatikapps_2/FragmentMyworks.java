package com.example.diefel.prototypebatikapps_2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.diefel.prototypebatikapps_2.MyWorks.MyWorksAdapter;
import com.example.diefel.prototypebatikapps_2.MyWorks.SlidingTabLayout;

/**
 * Created by ASUS on 12/6/2016.
 */

public class FragmentMyworks extends Fragment {

    private SlidingTabLayout mSlidingTabLayout;
    private ViewPager mViewPager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_myworks,container,false);

        mViewPager = (ViewPager)v.findViewById(R.id.viewPagerMyWorks);
        mViewPager.setAdapter(new MyWorksAdapter(getChildFragmentManager(),getContext()));

        mSlidingTabLayout = (SlidingTabLayout)v.findViewById(R.id.slidingTabMyWorks);
        mSlidingTabLayout.setDistributeEvenly(true);
        mSlidingTabLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        mSlidingTabLayout.setSelectedIndicatorColors(getResources().getColor(R.color.colorWhite));
        mSlidingTabLayout.setCustomTabView(R.layout.fragmetn_myworks_tab_view, R.id.tv_myworksTab);
        mSlidingTabLayout.setViewPager(mViewPager);


        return v;
    }

}
