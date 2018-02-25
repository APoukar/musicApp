package com.example.android.musicapp;

/**
 * Created by adam on 25.2.18.
 */

public final class Song {
    private String mSongName;
    private String mArtist;
    private String mAlbum;
    //private String mAlbumCover;

    public Song (String songName, String artist, String album) {
        mSongName = songName;
        mArtist = artist;
        mAlbum = album;
        //mAlbumCover = albumCover;
    }

    public String getSongName {
        return mSongName;
    }

    public String getArtist {
        return mArtist;
    }

    public String getAlbum {
        return mAlbum;
    }
}
