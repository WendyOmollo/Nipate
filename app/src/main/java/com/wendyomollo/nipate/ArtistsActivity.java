package com.wendyomollo.nipate;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;


import com.wendyomollo.nipate.R;
import com.wendyomollo.nipate.SongArrayAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ArtistsActivity extends Activity implements View.OnClickListener {
@BindView(R.id.findArtistButtonView)
Button mFindArtists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);
        ButterKnife.bind(this);
        Intent intent = getIntent();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(ArtistsActivity.this,DetailsActivity.class);
        startActivity(intent);
    }
}