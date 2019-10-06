package com.wendyomollo.nipate;
import android.widget.ArrayAdapter;

import android.content.Context;

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


}