package com.wendyomollo.nipate;
import android.widget.ArrayAdapter;

import android.content.Context;

public class SongArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mArtists;


    public SongArrayAdapter(Context mContext,int resource,String[] mArtists){
        super(mContext, resource);
        this.mContext = mContext;
        this.mArtists=mArtists;

    }

    @Override
    public int getCount() {
        return mArtists.length;
    }

    @Override
    public Object getItem(int position) {
        String artist = mArtists[position];
        return String.format("%s", artist);
    }
}