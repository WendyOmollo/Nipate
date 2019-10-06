package com.wendyomollo.nipate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ArtistsActivity extends AppCompatActivity {
    @BindView(R.id.listView) ListView mListView;
    @BindView(R.id.locationTextView) TextView mLocationTextView;
    private String [] artists = new String[] {"Kevo Simple Boy","Cute Boy","Samantha","Karesh","Opobae","Katumbo","Okonkwo",
            "Matoke man","BlankRoom","Rose Malaki","Ali Manxu","Chingweng"};

    private String [] songs = new String[]{"Mihadarati","Mafisi","Pendo la Jesus","Urembo gharama","Sisi Wenyewe","Katumbo dance",
    "Kisii life","Katastrophiii","Kanisa Letu","Vijana","Pastor Bonoko"};

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("In "+ location +" we have the following artists.Click on an artist for more details:");


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, artists);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FragmentManager fm = getSupportFragmentManager();
                DetailsActivity detailsActivity = new DetailsActivity();
                detailsActivity.show(fm,"Sample Fragment");


            }
        });

    }
}
