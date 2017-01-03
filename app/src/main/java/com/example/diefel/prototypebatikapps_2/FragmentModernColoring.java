package com.example.diefel.prototypebatikapps_2;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by ASUS on 12/15/2016.
 */

public class FragmentModernColoring extends AppCompatActivity {
    ImageView patternModern;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_coloring_modern);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //loadDataFromAsset();
    }
   /* public void loadDataFromAsset()
    {
        // load image
        try {
            // get input stream
            InputStream ims = getAssets().open("pattern_modern/modern_1.png");
            // load image as Drawable
            Drawable d = Drawable.createFromStream(ims, null);
            // set image to ImageView
            patternModern = (ImageView)findViewById(R.id.patternModern);
            patternModern.setImageDrawable(d);
        }
        catch(IOException ex) {
            return;
        }
    }*/

    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainMenuActivity.class);
        startActivityForResult(myIntent, 0);
        return true;
    }
}
