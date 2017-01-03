package com.example.diefel.prototypebatikapps_2;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by ASUS on 12/15/2016.
 */

public class FragmentTraditionalColoring extends AppCompatActivity {
    ImageView patternTraditional;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_coloring_traditional);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        loadDataFromAsset();
    }

    public void loadDataFromAsset()
    {
        // load image
        try {
            // get input stream
            InputStream ims = getAssets().open("pattern_traditional/dayak.png");
            // load image as Drawable
            Drawable d = Drawable.createFromStream(ims, null);
            // set image to ImageView
            patternTraditional = (ImageView)findViewById(R.id.patternTraditional);
            patternTraditional.setImageDrawable(d);
        }
        catch(IOException ex) {
            return;
        }
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainMenuActivity.class);
        startActivityForResult(myIntent, 0);
        return true;
    }
}
