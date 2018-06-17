package com.example.android.musicapp;

import android.support.annotation.Nullable;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.musicapp.Adapters.AlbumsAdapter;

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
        albums.add(new Song("name7", "artist7", "album7"));
        albums.add(new Song("name8", "artist8", "album8"));
        albums.add(new Song("name9", "artist9", "album9"));
        return albums;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.activity_albums, container, false);
        recyclerView = layout.findViewById(R.id.recycle_view_albums);
        adapter = new AlbumsAdapter(getActivity(), getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));

        return layout;
    }
}

