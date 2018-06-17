package com.example.android.musicapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.musicapp.Adapters.AndroidSongAdapter;
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
        addSongs(songs);

        AndroidSongAdapter songAdapter = new AndroidSongAdapter(getActivity(), songs);
        ExpandableHeightListView songList = rootView.findViewById(R.id.song_list);
        songList.setAdapter(songAdapter);
        songList.setExpanded(true);

        return rootView;
    }

    private void addSongs(ArrayList<Song> list) {
        for (int i = 0; i < 25; i++) {
            list.add(new Song("Name " + i, "Artist " + i, "Album " + i));
        }
    }

}

