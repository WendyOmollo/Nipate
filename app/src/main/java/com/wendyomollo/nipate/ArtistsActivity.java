package com.wendyomollo.nipate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import butterknife.BindView;

public class ArtistsActivity extends AppCompatActivity {
    @BindView(R.id.listView) ListView mListView;
    private String [] artists = new String[] {"Kevo Simple Boy","Cute Boy","Samantha","Karesh","Opobae","Katumbo","Okonkwo",
            "Matoke man","BlankRoom","Rose Malaki","Ali Manxu","Chingweng"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);
    }
}
