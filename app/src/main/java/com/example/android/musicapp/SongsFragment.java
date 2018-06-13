package com.example.android.musicapp;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import com.github.paolorotolo.expandableheightlistview.ExpandableHeightListView;

import java.util.ArrayList;

/**
 * Created by Adam Poukar on 25.2.18.
 */

public class SongsFragment extends android.support.v4.app.Fragment {

    public SongsFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_songs, container, false);
        //TODO create loop to get all the songs from the device
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("name1", "artist1", "album1"));
        songs.add(new Song("name2", "artist2", "album2"));
        songs.add(new Song("name3", "artist3", "album3"));

        AndroidSongAdapter songAdapter = new AndroidSongAdapter(getActivity(), songs);
        ExpandableHeightListView songList = rootView.findViewById(R.id.song_list);
        songList.setAdapter(songAdapter);
        songList.setExpanded(true);

        return rootView;
    }


}

