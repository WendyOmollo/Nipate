package com.wendyomollo.nipate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.DialogFragment;

import butterknife.BindView;

public class DetailsActivity extends DialogFragment {
    @BindView(R.id.artistButtonView) Button mArtistDetails;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_details, container, false);



        return rootView;
    }

}