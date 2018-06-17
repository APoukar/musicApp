package com.example.android.musicapp;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.example.android.musicapp.Adapters.AlbumsAdapter;

import java.util.ArrayList;
import java.util.List;

public class AlbumsFragment extends android.support.v4.app.Fragment {



    public AlbumsFragment() {

    }

    private static List<Song> addSongs() {
        ArrayList<Song> list = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            list.add(new Song("Name " + i, "Artist " + i, "Album " + i));
        }
        return list;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.activity_albums, container, false);
        setRecyclerView(layout);
        return layout;
    }

    private void setRecyclerView(View layout) {
        RecyclerView recyclerView = layout.findViewById(R.id.recycle_view_albums);
        AlbumsAdapter adapter = new AlbumsAdapter(getActivity(), addSongs());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
    }
}

