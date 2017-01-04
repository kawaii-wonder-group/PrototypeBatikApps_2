package com.example.diefel.prototypebatikapps_2.MyWorks.MyWorks.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.diefel.prototypebatikapps_2.R;

/**
 * Created by ASUS on 12/27/2016.
 */

public class FragmentMyWorksColoring extends Fragment implements View.OnClickListener {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_myworks_coloring,container,false);

        Button test = (Button)v.findViewById(R.id.myworkstest);
        test.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.myworkstest)
        {
            Toast.makeText(getContext(),"test",Toast.LENGTH_LONG).show();
        }
    }
}
