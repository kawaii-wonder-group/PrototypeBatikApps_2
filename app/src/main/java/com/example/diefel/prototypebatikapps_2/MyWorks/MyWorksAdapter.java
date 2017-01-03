package com.example.diefel.prototypebatikapps_2.MyWorks;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ImageSpan;

import com.example.diefel.prototypebatikapps_2.MyWorks.MyWorks.Fragment.FragmentMyWorksColoring;
import com.example.diefel.prototypebatikapps_2.MyWorks.MyWorks.Fragment.FragmentMyWorksCreate;
import com.example.diefel.prototypebatikapps_2.R;

/**
 * Created by ASUS on 12/27/2016.
 */

public class MyWorksAdapter extends FragmentPagerAdapter{
    private Context mContext;
    private String[] titles = {"A","B"};
    int[] icons = new int[]{R.drawable.bottom_coloring_putih,R.drawable.bottom_create_putih};
    private int heightIcon;

    public MyWorksAdapter(FragmentManager fm,Context c) {
        super(fm);
        mContext = c;
        double scale=c.getResources().getDisplayMetrics().density;
        heightIcon = (int)(24*scale*1.5f);
    }



    @Override
    public Fragment getItem(int position) {
        Fragment worksfragment = null;
        if (position == 0)
        {
            worksfragment = new FragmentMyWorksColoring();
        }
        else if (position == 1)
        {
            worksfragment = new FragmentMyWorksCreate();
        }
        Bundle b  = new Bundle();
        b.putInt("position",position);

        worksfragment.setArguments(b);
        return worksfragment;
    }

    @Override
    public int getCount() {
        //return 0;
        return titles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Drawable d = mContext.getResources().getDrawable(icons[position]);
        d.setBounds(0,0,heightIcon,heightIcon);

        ImageSpan is = new ImageSpan(d);

        SpannableString sp = new SpannableString(" ");
        sp.setSpan(is,0,sp.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return (sp);
        //return super.getPageTitle(position);
    }
}