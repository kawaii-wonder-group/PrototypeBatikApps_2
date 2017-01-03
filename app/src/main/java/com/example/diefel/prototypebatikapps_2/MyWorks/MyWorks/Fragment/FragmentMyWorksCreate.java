package com.example.diefel.prototypebatikapps_2.MyWorks.MyWorks.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.diefel.prototypebatikapps_2.R;

/**
 * Created by ASUS on 12/27/2016.
 */

public class FragmentMyWorksCreate extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_myworks_create,container,false);
        return v;
    }
}
