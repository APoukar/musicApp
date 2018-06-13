package com.example.android.musicapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

public class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.AlbumViewHolder> {

    private LayoutInflater inflater;
    private List<Song> mData = Collections.emptyList();

    AlbumsAdapter(Context context, List<Song> data) {
        inflater = LayoutInflater.from(context);
        mData = data;
    }

    @Override
    public AlbumViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.activity_album_item, parent, false);

        return new AlbumViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AlbumViewHolder holder, int position) {
        Song current = mData.get(position);
        holder.songName.setText(current.getSongName());
        holder.author.setText(current.getArtist());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class AlbumViewHolder extends RecyclerView.ViewHolder {

        TextView songName;
        TextView author;

        AlbumViewHolder(View itemView) {
            super(itemView);
            songName = itemView.findViewById(R.id.album_song_name);
            author = itemView.findViewById(R.id.album_author);
        }
    }
}
