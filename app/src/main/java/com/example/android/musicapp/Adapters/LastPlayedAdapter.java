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

public class LastPlayedAdapter extends RecyclerView.Adapter<LastPlayedAdapter.LastPlayedViewHolder> {

    private LayoutInflater inflater;
    private List<Song> mData = Collections.emptyList();

    public LastPlayedAdapter(Context context, List<Song> data) {
        inflater = LayoutInflater.from(context);
        mData = data;
    }

    @Override
    public LastPlayedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.activity_home_item, parent, false);

        return new LastPlayedAdapter.LastPlayedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LastPlayedViewHolder holder, int position) {
        Song current = mData.get(position);
        holder.songName.setText(current.getSongName());
        holder.author.setText(current.getArtist());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class LastPlayedViewHolder extends RecyclerView.ViewHolder {

        TextView songName;
        TextView author;

        //TODO: Refactor activity_album_item to be universal
        LastPlayedViewHolder(View itemView) {
            super(itemView);
            songName = itemView.findViewById(R.id.home_item_song);
            author = itemView.findViewById(R.id.home_item_author);

        }


    }
}
