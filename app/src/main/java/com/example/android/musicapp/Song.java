package com.example.android.musicapp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by adam on 25.2.18.
 */

public class Song implements Parcelable {
    private String mSongName;
    private String mArtist;
    private String mAlbum;
    //private String mAlbumCover;

    public static final Creator<Song> CREATOR = new Creator<Song>() {
        @Override
        public Song createFromParcel(Parcel in) {
            return new Song(in);
        }

        @Override
        public Song[] newArray(int size) {
            return new Song[size];
        }
    };

    Song(String songName, String artist, String album) {
        mSongName = songName;
        mArtist = artist;
        mAlbum = album;
        //mAlbumCover = albumCover;
    }

    private Song(Parcel in) {
        mSongName = in.readString();
        mArtist = in.readString();
        mAlbum = in.readString();
    }

    public String getSongName() {
        return mSongName;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getAlbum() {
        return mAlbum;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mSongName);
        dest.writeString(mArtist);
        dest.writeString(mAlbum);
    }
}
