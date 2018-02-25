package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.github.paolorotolo.expandableheightlistview.ExpandableHeightListView;

import java.util.ArrayList;

/**
 * Created by Adam Poukar on 25.2.18.
 */

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        ImageView homeMenuIcon = (ImageView) findViewById(R.id.home_menu_icon);
        homeMenuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeActivityIntent = new Intent(SongsActivity.this, HomeActivity.class);
                startActivity(homeActivityIntent);
            }
        });

        ImageView albumsMenuIcon = (ImageView) findViewById(R.id.album_menu_icon);
        albumsMenuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsActivityIntent = new Intent(SongsActivity.this, AlbumsActivity.class);
                startActivity(albumsActivityIntent);
            }
        });


//TODO create loop to get all the songs from the device
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Song name 1", "Artist 1", "Album 1"));
        songs.add(new Song("Song name 2", "Artist 2", "Album 2"));
        songs.add(new Song("Song name 3", "Artist 3", "Album 3"));

        AndroidSongAdapter songAdapter = new AndroidSongAdapter(this, songs);
        ExpandableHeightListView songList = (ExpandableHeightListView) findViewById(R.id.song_list);
        songList.setAdapter(songAdapter);
        songList.setExpanded(true);
    }
}
