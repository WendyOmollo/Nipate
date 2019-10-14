package com.wendyomollo.nipate.main;

import androidx.appcompat.app.AppCompatActivity;
<<<<<<< HEAD:app/src/main/java/com/wendyomollo/nipate/ArtistsActivity.java
=======
import androidx.fragment.app.FragmentManager;
>>>>>>> 2502c28175a561c2d891a5d3856040c9ff3a082f:app/src/main/java/com/wendyomollo/nipate/main/ArtistsActivity.java

import android.os.Bundle;
<<<<<<< HEAD:app/src/main/java/com/wendyomollo/nipate/ArtistsActivity.java
=======
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.wendyomollo.nipate.R;

import butterknife.BindView;
import butterknife.ButterKnife;
>>>>>>> 2502c28175a561c2d891a5d3856040c9ff3a082f:app/src/main/java/com/wendyomollo/nipate/main/ArtistsActivity.java

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);
<<<<<<< HEAD:app/src/main/java/com/wendyomollo/nipate/ArtistsActivity.java
=======
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("In "+ location +" we have the following artists.Click on an artist for more details:");

        SongArrayAdapter songArrayAdapter = new SongArrayAdapter(this, android.R.layout.simple_list_item_1, artists,songs);
        mListView.setAdapter(songArrayAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FragmentManager fm = getSupportFragmentManager();
                DetailsActivity detailsActivity = new DetailsActivity();
                detailsActivity.show(fm,"Sample Fragment");
            }
        });

>>>>>>> 2502c28175a561c2d891a5d3856040c9ff3a082f:app/src/main/java/com/wendyomollo/nipate/main/ArtistsActivity.java
    }
}
