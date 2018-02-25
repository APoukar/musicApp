package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView songsMenuIcon = (ImageView) findViewById(R.id.song_menu_icon);
        songsMenuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsActivityIntent = new Intent(HomeActivity.this, SongsActivity.class);
                startActivity(songsActivityIntent);
            }
        });

        ImageView albumsMenuIcon = (ImageView) findViewById(R.id.album_menu_icon);
        albumsMenuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsActivityIntent = new Intent(HomeActivity.this, AlbumsActivity.class);
                startActivity(albumsActivityIntent);
            }
        });
    }
}
