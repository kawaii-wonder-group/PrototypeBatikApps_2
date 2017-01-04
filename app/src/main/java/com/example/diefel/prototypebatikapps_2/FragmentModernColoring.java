package com.example.diefel.prototypebatikapps_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.content.Intent;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.diefel.prototypebatikapps_2.Adapter.AdapterPattern;
import com.example.diefel.prototypebatikapps_2.Model.ModelPattern;


/**
 * Created by kawaii on 12/15/2016.
 */

public class FragmentModernColoring extends AppCompatActivity {
    ImageView modern;

    private ListView listViewpattern;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_coloring_modern);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        contentpattern();
    }

    public void contentpattern(){
        ModelPattern weather_data[] = new ModelPattern[]
        {
            new ModelPattern(R.drawable.modern_1, null),
            new ModelPattern(R.drawable.modern_2, null),
            new ModelPattern(R.drawable.modern_3, null),
            new ModelPattern(R.drawable.modern_4, null),
            new ModelPattern(R.drawable.modern_5, null),
            new ModelPattern(R.drawable.modern_6, null),
            new ModelPattern(R.drawable.modern_7, null)
        };

        AdapterPattern adapter = new AdapterPattern(this, R.layout.itempattern, weather_data);
        listViewpattern = (ListView)findViewById(R.id.lvpattern);
        listViewpattern.setAdapter(adapter);
    }

    public boolean onOptionsItemSelected(MenuItem item){
         Intent myIntent = new Intent(getApplicationContext(), MainMenuActivity.class);
         startActivityForResult(myIntent, 0);
        return true;
    }

}
