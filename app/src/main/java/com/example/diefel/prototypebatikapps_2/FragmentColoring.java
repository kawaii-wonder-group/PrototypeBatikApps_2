package com.example.diefel.prototypebatikapps_2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by ASUS on 12/6/2016.
 */

public class FragmentColoring extends Fragment {
    MediaPlayer bgmusic;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_coloring,container,false);
        ImageView btnTraditional = (ImageView) v.findViewById(R.id.btnTraditional);
        ImageView btnModern = (ImageView) v.findViewById(R.id.btnModern);
        ImageView btnOption = (ImageView) v.findViewById(R.id.btnOption);



        btnTraditional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),FragmentTraditionalColoring.class);
                startActivity(i);
            }
        });

        btnModern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),FragmentModernColoring.class);
                startActivity(i);
            }
        });

        btnOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),TestPopUp.class);
                startActivity(i);
            }
        });

        return v;
    }

    @Override
    public void onPause() {
        super.onPause();
    }
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);


    }
}
