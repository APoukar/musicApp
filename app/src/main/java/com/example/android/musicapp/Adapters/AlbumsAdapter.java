package com.example.android.musicapp.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.musicapp.R;
import com.example.android.musicapp.Song;

import java.util.Collections;
import java.util.List;

public class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.AlbumViewHolder> {

    private LayoutInflater inflater;
    private List<Song> mData = Collections.emptyList();

    public AlbumsAdapter(Context context, List<Song> data) {
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
        holder.albumName.setText(current.getAlbum());
        holder.author.setText(current.getArtist());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class AlbumViewHolder extends RecyclerView.ViewHolder {

        TextView albumName;
        TextView author;

        AlbumViewHolder(View itemView) {
            super(itemView);
            albumName = itemView.findViewById(R.id.album_item_album);
            author = itemView.findViewById(R.id.album_item_author);
        }
    }
}
