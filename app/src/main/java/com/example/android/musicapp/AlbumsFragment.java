package com.example.android.musicapp;

import android.app.Fragment;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class AlbumsFragment extends android.support.v4.app.Fragment {

    RecyclerView recyclerView;
    AlbumsAdapter adapter;

    public AlbumsFragment() {

    }

    private static List<Song> getData() {
        ArrayList<Song> albums = new ArrayList<>();
        albums.add(new Song("name1", "artist1", "album1"));
        albums.add(new Song("name2", "artist2", "album2"));
        albums.add(new Song("name3", "artist3", "album3"));
        albums.add(new Song("name4", "artist4", "album4"));
        albums.add(new Song("name5", "artist5", "album5"));
        albums.add(new Song("name6", "artist6", "album6"));
        return albums;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.activity_albums, container, false);
        recyclerView = layout.findViewById(R.id.recycle_view_albums);
        adapter = new AlbumsAdapter(getActivity(), getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return layout;
    }
}

