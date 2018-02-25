package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        ImageView homeMenuIcon = (ImageView) findViewById(R.id.home_menu_icon);
        homeMenuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeActivityIntent = new Intent(AlbumsActivity.this, HomeActivity.class);
                startActivity(homeActivityIntent);
            }
        });

        ImageView songsMenuIcon = (ImageView) findViewById(R.id.song_menu_icon);
        songsMenuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsActivityIntent = new Intent(AlbumsActivity.this, SongsActivity.class);
                startActivity(songsActivityIntent);
            }
        });
    }
}
