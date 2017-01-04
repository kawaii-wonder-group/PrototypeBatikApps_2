package com.example.diefel.prototypebatikapps_2;

import android.content.Intent;
import android.media.AudioManager;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.os.Bundle;
import android.view.MenuItem;
import android.media.MediaPlayer;
import android.widget.SeekBar;
import android.widget.TextView;

import static android.R.color.white;

public class MainMenuActivity extends AppCompatActivity {

    private Fragment fragment;
    private FragmentManager fragmentManager;
    MediaPlayer bgmusic;

    SeekBar seekBar;
    TextView textView;
    MediaPlayer mediaPlayer;

    Handler handler;
    Runnable runnable;

    public SeekBar volume = null;
    public AudioManager audioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment fragment = null;
                    switch (item.getItemId() ) {
                        case R.id.menubottomColoring:
                            fragment = new FragmentColoring();
                            break;

                        case R.id.menubottonCreate:
                            fragment = new DrawingFun();
                            break;

                        case R.id.menubottomMyworks:
                            fragment = new FragmentMyworks();
                            break;
                        default:
                            break;
                    }
                    if (fragment != null)
                    {
                        replaceFragment(fragment);
                    }
                    return true;
                }
            });
        replaceFragment(new FragmentColoring());
    }

    private void replaceFragment(Fragment fragment)
    {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_container, fragment).addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        bgmusic = MediaPlayer.create(MainMenuActivity.this,R.raw.cublak2_suweng);
        bgmusic.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_option, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
