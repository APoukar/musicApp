package com.example.android.musicapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.musicapp.Adapters.LastPlayedAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends android.support.v4.app.Fragment {

    RecyclerView lastPlayedrecyclerView;
    RecyclerView favoriteRecyclerView;
    RecyclerView recentRecyclerView;
    LastPlayedAdapter adapter;

    public HomeFragment() {

    }

    private static List<Song> getData() {
        ArrayList<Song> list = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            list.add(new Song("Name " + i, "Artist " + i, "Album " + i));
        }
        return list;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.activity_home, container, false);
        setUpLastPlayed(layout);
        setUpFavorite(layout);
        setUpRecent(layout);
        return layout;

    }

    private void setUpLastPlayed(View layout) {
        lastPlayedrecyclerView = layout.findViewById(R.id.recycle_view_last_played);
        adapter = new LastPlayedAdapter(getActivity(), getData());
        lastPlayedrecyclerView.setAdapter(adapter);
        lastPlayedrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
    }

    private void setUpFavorite(View layout) {
        favoriteRecyclerView = layout.findViewById(R.id.recycle_view_favorite);
        adapter = new LastPlayedAdapter(getActivity(), getData());
        favoriteRecyclerView.setAdapter(adapter);
        favoriteRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
    }

    private void setUpRecent(View layout) {
        recentRecyclerView = layout.findViewById(R.id.recycle_view_new_added);
        adapter = new LastPlayedAdapter(getActivity(), getData());
        recentRecyclerView.setAdapter(adapter);
        recentRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
    }
}