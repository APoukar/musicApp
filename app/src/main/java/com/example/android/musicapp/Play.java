package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Play extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        setSongInfo(getSong());
    }

    private Song getSong() {
        Intent intent;
        intent = getIntent();
        return intent.getParcelableExtra("song");
    }

    private void setSongInfo(Song song) {
        ImageView albumCover = findViewById(R.id.play_album_cover);
        TextView songName = findViewById(R.id.play_song);
        TextView songInfo = findViewById(R.id.play_author);

        String info = song.getArtist() +
                " \u00B7 " + song.getAlbum();

        albumCover.setImageResource(song.getAlbumCover());
        songName.setText(song.getSongName());
        songInfo.setText(info);
    }
}
