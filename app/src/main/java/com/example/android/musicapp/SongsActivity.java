package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
