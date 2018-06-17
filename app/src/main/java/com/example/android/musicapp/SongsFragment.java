package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.example.android.musicapp.Adapters.AndroidSongAdapter;
import com.github.paolorotolo.expandableheightlistview.ExpandableHeightListView;

import java.util.ArrayList;

/**
 * Created by Adam Poukar on 25.2.18.
 */

public class SongsFragment extends android.support.v4.app.Fragment implements AdapterView.OnItemClickListener {

    private ArrayList<Song> songs;

    public SongsFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_songs, container, false);
        songs = new ArrayList<>();
        addSongs();
        setListView(rootView, songs);
        return rootView;
    }

    private void addSongs() {
        for (int i = 0; i < 25; i++) {
            songs.add(new Song("Name " + i, "Artist " + i, "Album " + i, R.drawable.letitbe));
        }
    }

    private void setListView(View rootView, final ArrayList<Song> songs) {
        AndroidSongAdapter songAdapter = new AndroidSongAdapter(getActivity(), songs);
        ExpandableHeightListView songList = rootView.findViewById(R.id.song_list);
        songList.setAdapter(songAdapter);
        songList.setExpanded(true);
        songList.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Song song = songs.get(position);
        Intent playSong = new Intent(getActivity(), Play.class)
                .putExtra("song", song);
        startActivity(playSong);
    }
    }

