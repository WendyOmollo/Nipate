package com.wendyomollo.nipate;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import static com.wendyomollo.nipate.BuildConfig.API_KEY;



public class DetailsActivity extends YouTubeBaseActivity {
    private static final String TAG = "Main Activity";
    private Button b;
    private YouTubePlayerView youTubePlayerView;
    private YouTubePlayer.OnInitializedListener onInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent intent = getIntent();

        youTubePlayerView = findViewById(R.id.youtube_view);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("Wjrrgrvq1ew");
                youTubePlayer.play();
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG,"Failed to initialize");
            }
        };

        b = findViewById(R.id.playVideoView);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                youTubePlayerView.initialize(API_KEY,onInitializedListener);
            }
        });
    }


}

