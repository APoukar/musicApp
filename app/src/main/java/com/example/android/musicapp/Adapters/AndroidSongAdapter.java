package com.example.android.musicapp.Adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.musicapp.R;
import com.example.android.musicapp.Song;

import java.util.ArrayList;

/**
 * Created by Adam Poukar on 25.2.18.
 */

public class AndroidSongAdapter extends ArrayAdapter<Song> {

    private static final String LOG_TAG = AndroidSongAdapter.class.getSimpleName();

    public AndroidSongAdapter(Activity context, ArrayList<Song> song) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, song);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View songListView = convertView;
        if (songListView == null) {
            songListView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView songName = songListView.findViewById(R.id.song_name);
        songName.setText(currentSong.getSongName());

        TextView artist = songListView.findViewById(R.id.author);
        artist.setText(currentSong.getArtist());

        return songListView;
    }
}
