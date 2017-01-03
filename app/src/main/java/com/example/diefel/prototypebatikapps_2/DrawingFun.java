package com.example.diefel.prototypebatikapps_2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by ASUS on 12/16/2016.
 */

public class DrawingFun extends Fragment {
    private DrawingView drawView;
    private ImageButton currPaint,erase_btn;
/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawing_fun);*/

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.drawing_fun,container,false);

        //inisial drawing view buat di layout , dan di kasih id nya
        drawView = (DrawingView)v.findViewById(R.id.drawing);

        //color pallet
        LinearLayout paintLayout = (LinearLayout)v.findViewById(R.id.paint_colors);
        ImageButton color1 = (ImageButton)v.findViewById(R.id.color1);
        ImageButton color2 = (ImageButton)v.findViewById(R.id.color2);
        ImageButton color3 = (ImageButton)v.findViewById(R.id.color3);
        ImageButton color4 = (ImageButton)v.findViewById(R.id.color4);
        ImageButton color5 = (ImageButton)v.findViewById(R.id.color5);
        ImageButton color6 = (ImageButton)v.findViewById(R.id.color6);
        ImageButton color7 = (ImageButton)v.findViewById(R.id.color7);
        ImageButton color8 = (ImageButton)v.findViewById(R.id.color8);
        ImageButton color9 = (ImageButton)v.findViewById(R.id.color9);
        ImageButton color10 = (ImageButton)v.findViewById(R.id.color10);
        ImageButton color11 = (ImageButton)v.findViewById(R.id.color11);
        ImageButton color12 = (ImageButton)v.findViewById(R.id.color12);

        //Coloring Tools
        ImageButton erase_btn = (ImageButton)v.findViewById(R.id.erase_btn);

        //define buat default color pallet
        currPaint = (ImageButton)paintLayout.getChildAt(0);
        //erase_btn = (ImageButton)paintLayout.getChildAt(1);

        //buat current select color pallet
        currPaint.setImageDrawable(getResources().getDrawable(R.drawable.paint_pressed));
        //erase_btn.setImageDrawable(getResources().getDrawable(R.drawable.eraser));



        //color pallet listener
        paintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v != currPaint){
                    //update color , untuk ambil tag dari color picker
                    ImageButton imgView = (ImageButton)v;
                    String color = v.getTag().toString();

                    //buat setting ganti color
                    drawView.setColor(color);
                    imgView.setImageDrawable(getResources().getDrawable(R.drawable.paint_pressed));
                    currPaint.setImageDrawable(getResources().getDrawable(R.drawable.paint));
                    currPaint=(ImageButton)v;
                }
            }
        });

        color1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getContext(),"Test Color 2",Toast.LENGTH_SHORT).show();
                ImageButton imgView = (ImageButton)v;
                String color = v.getTag().toString();

                //buat setting ganti color
                drawView.setColor(color);
                imgView.setImageDrawable(getResources().getDrawable(R.drawable.paint_pressed));
                currPaint.setImageDrawable(getResources().getDrawable(R.drawable.paint));
                currPaint=(ImageButton)v;
            }
        });

        color2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getContext(),"Test Color 2",Toast.LENGTH_SHORT).show();
                ImageButton imgView = (ImageButton)v;
                String color = v.getTag().toString();

                //buat setting ganti color
                drawView.setColor(color);
                imgView.setImageDrawable(getResources().getDrawable(R.drawable.paint_pressed));
                currPaint.setImageDrawable(getResources().getDrawable(R.drawable.paint));
                currPaint=(ImageButton)v;
            }
        });

        color3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton imgView = (ImageButton)v;
                String color = v.getTag().toString();

                //buat setting ganti color
                drawView.setColor(color);
                imgView.setImageDrawable(getResources().getDrawable(R.drawable.paint_pressed));
                currPaint.setImageDrawable(getResources().getDrawable(R.drawable.paint));
                currPaint=(ImageButton)v;
            }
        });

        color4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton imgView = (ImageButton)v;
                String color = v.getTag().toString();

                //buat setting ganti color
                drawView.setColor(color);
                imgView.setImageDrawable(getResources().getDrawable(R.drawable.paint_pressed));
                currPaint.setImageDrawable(getResources().getDrawable(R.drawable.paint));
                currPaint=(ImageButton)v;
            }
        });

        color5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton imgView = (ImageButton)v;
                String color = v.getTag().toString();

                //buat setting ganti color
                drawView.setColor(color);
                imgView.setImageDrawable(getResources().getDrawable(R.drawable.paint_pressed));
                currPaint.setImageDrawable(getResources().getDrawable(R.drawable.paint));
                currPaint=(ImageButton)v;
            }
        });

        color6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton imgView = (ImageButton)v;
                String color = v.getTag().toString();

                //buat setting ganti color
                drawView.setColor(color);
                imgView.setImageDrawable(getResources().getDrawable(R.drawable.paint_pressed));
                currPaint.setImageDrawable(getResources().getDrawable(R.drawable.paint));
                currPaint=(ImageButton)v;
            }
        });

        color7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton imgView = (ImageButton)v;
                String color = v.getTag().toString();

                //buat setting ganti color
                drawView.setColor(color);
                imgView.setImageDrawable(getResources().getDrawable(R.drawable.paint_pressed));
                currPaint.setImageDrawable(getResources().getDrawable(R.drawable.paint));
                currPaint=(ImageButton)v;
            }
        });

        color8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton imgView = (ImageButton)v;
                String color = v.getTag().toString();

                //buat setting ganti color
                drawView.setColor(color);
                imgView.setImageDrawable(getResources().getDrawable(R.drawable.paint_pressed));
                currPaint.setImageDrawable(getResources().getDrawable(R.drawable.paint));
                currPaint=(ImageButton)v;
            }
        });

        color9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton imgView = (ImageButton)v;
                String color = v.getTag().toString();

                //buat setting ganti color
                drawView.setColor(color);
                imgView.setImageDrawable(getResources().getDrawable(R.drawable.paint_pressed));
                currPaint.setImageDrawable(getResources().getDrawable(R.drawable.paint));
                currPaint=(ImageButton)v;
            }
        });

        color10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton imgView = (ImageButton)v;
                String color = v.getTag().toString();

                //buat setting ganti color
                drawView.setColor(color);
                imgView.setImageDrawable(getResources().getDrawable(R.drawable.paint_pressed));
                currPaint.setImageDrawable(getResources().getDrawable(R.drawable.paint));
                currPaint=(ImageButton)v;
            }
        });

        color11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton imgView = (ImageButton)v;
                String color = v.getTag().toString();

                //buat setting ganti color
                drawView.setColor(color);
                imgView.setImageDrawable(getResources().getDrawable(R.drawable.paint_pressed));
                currPaint.setImageDrawable(getResources().getDrawable(R.drawable.paint));
                currPaint=(ImageButton)v;
            }
        });

        color12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton imgView = (ImageButton)v;
                String color = v.getTag().toString();

                //buat setting ganti color
                drawView.setColor(color);
                imgView.setImageDrawable(getResources().getDrawable(R.drawable.paint_pressed));
                currPaint.setImageDrawable(getResources().getDrawable(R.drawable.paint));
                currPaint=(ImageButton)v;
            }
        });

        return v;
    }

    //onclick listener buat di color pallet view buat di aktiviti drawing fun
    /*public void paintClicked(View view){
        //use chosen color
        //cek jika user tidak memilih color pallet sama sekali

        if(view!=currPaint){
            //update color , untuk ambil tag dari color picker
            ImageButton imgView = (ImageButton)view;
            String color = view.getTag().toString();

            //buat setting ganti color
            drawView.setColor(color);
            imgView.setImageDrawable(getResources().getDrawable(R.drawable.paint_pressed));
            currPaint.setImageDrawable(getResources().getDrawable(R.drawable.paint));
            currPaint=(ImageButton)view;
        }
        if (view == erase_btn)
        {
            drawView.setColor("#FFFFFF");
            Toast toast = Toast.makeText(getContext(),"Test INi penghapus", Toast.LENGTH_LONG);
            toast.show();
        }
    }*/
}

