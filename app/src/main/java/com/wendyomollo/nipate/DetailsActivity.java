package com.wendyomollo.nipate;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.Vector;

import static com.wendyomollo.nipate.BuildConfig.API_KEY;



public class DetailsActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Vector<YoutubeVideos> youtubeVideos = new Vector<>();
    private static final String TAG = "Main Activity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_bar);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https:www.youtube.com/embed/wcokc1sM-TU\" frameborder=\"0\" allowFullScreenSize></iframe>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https:www.youtube.com/embed/5dRtKakefZ8\" frameborder=\"0\" allowFullScreenSize></iframe>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https:www.youtube.com/embed/TNIMIUtz9OE\" frameborder=\"0\" allowFullScreenSize></iframe>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https:www.youtube.com/embed/33yIPTvURfk\" frameborder=\"0\" allowFullScreenSize></iframe>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https:www.youtube.com/embed/PMEGUx7MfCM\" frameborder=\"0\" allowFullScreenSize></iframe>"));

        SongArrayAdapter songArrayAdapter = new SongArrayAdapter(youtubeVideos);
        recyclerView.setAdapter(songArrayAdapter);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            switch (menuItem.getItemId()){
                case R.id.navigation_home:
                    Intent intent = new Intent(DetailsActivity.this,ArtistsActivity.class);
                    startActivity(intent);
                    break;

//                case R.id.navigation_videos:
//                    Intent intentVideos = new Intent(DetailsActivity.this,DetailsActivity.class);
//                    startActivity(intentVideos);
//                    break;
            }
            return false;
        }
    };


}

