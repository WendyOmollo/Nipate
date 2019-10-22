package com.wendyomollo.nipate;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ArtistsActivity extends Activity {

        @BindView(R.id.errorTextView)
        TextView mErrorTextView;
        @BindView(R.id.progressBar)
        ProgressBar mProgressBar;

        private ImageView imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);
        ButterKnife.bind(this);
        Intent intent = getIntent();

        imageView1 = findViewById(R.id.artist1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ArtistsActivity.this,DetailsActivity.class);
                startActivity(intent1);
            }
        });

        }
}