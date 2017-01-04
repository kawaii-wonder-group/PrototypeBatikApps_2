package com.example.diefel.prototypebatikapps_2.Adapter;

/**
 * Created by Asus on 04/01/2017.
 */

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.diefel.prototypebatikapps_2.Model.ModelPattern;
import com.example.diefel.prototypebatikapps_2.R;

public class AdapterPattern extends ArrayAdapter<ModelPattern> {

    Context context;
    int layoutResourceId;
    ModelPattern data[] = null;

    public AdapterPattern(Context context, int layoutResourceId, ModelPattern[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    static class WeatherHolder
    {
        ImageView imgpattern;
    }


    public View getView(int position, View convertView, ViewGroup parent){
        View row = convertView;
        WeatherHolder holder = null;

        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            holder = new WeatherHolder();
            holder.imgpattern = (ImageView)row.findViewById(R.id.imV);

            row.setTag(holder);
        }else{
            holder = (WeatherHolder)row.getTag();
        }
        ModelPattern weather = data[position];
        holder.imgpattern.setImageResource(weather.PatternImage);

        return row;
    }
}

