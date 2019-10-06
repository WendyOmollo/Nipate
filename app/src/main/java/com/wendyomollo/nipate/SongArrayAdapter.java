package com.wendyomollo.nipate;
import android.widget.ArrayAdapter;

import android.content.Context;

import androidx.annotation.Nullable;

public class SongArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mArtists;
    private String[] mSongs;

    public SongArrayAdapter(Context mContext,int resource,String[] mArtists,String[] mSongs){
        super(mContext, resource);
        this.mContext = mContext;
        this.mArtists=mArtists;
        this.mSongs=mSongs;
    }

    @Override
    public int getCount() {
        return mArtists.length;
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        String artist = mArtists[position];
        String song = mSongs[position];
        return String.format("%s \n Sang: %s", artist, song);
    }
}