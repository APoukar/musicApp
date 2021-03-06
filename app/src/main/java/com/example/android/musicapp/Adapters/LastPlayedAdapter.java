package com.example.android.musicapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.musicapp.Play;
import com.example.android.musicapp.R;
import com.example.android.musicapp.Song;

import java.util.Collections;
import java.util.List;

public class LastPlayedAdapter extends RecyclerView.Adapter<LastPlayedAdapter.LastPlayedViewHolder> {

    private LayoutInflater inflater;
    private Context mContext;
    private List<Song> mData = Collections.emptyList();

    public LastPlayedAdapter(Context context, List<Song> data) {
        mContext = context;
        inflater = LayoutInflater.from(mContext);
        mData = data;
    }

    @Override
    public LastPlayedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recycleview_item, parent, false);

        return new LastPlayedAdapter.LastPlayedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LastPlayedViewHolder holder, int position) {
        final Song current = mData.get(position);
        holder.songName.setText(current.getSongName());
        holder.author.setText(current.getArtist());
        holder.albumCover.setImageResource(current.getAlbumCover());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playSong = new Intent(mContext, Play.class)
                        .putExtra("song", current);
                mContext.startActivity(playSong);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class LastPlayedViewHolder extends RecyclerView.ViewHolder {

        TextView songName;
        TextView author;
        ImageView albumCover;

        //TODO: Refactor activity_album_item to be universal
        LastPlayedViewHolder(View itemView) {
            super(itemView);
            albumCover = itemView.findViewById(R.id.item_image);
            songName = itemView.findViewById(R.id.item_first_line);
            author = itemView.findViewById(R.id.item_second_line);

        }


    }
}
