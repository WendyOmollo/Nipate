package com.wendyomollo.nipate;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;


import com.wendyomollo.nipate.R;
import com.wendyomollo.nipate.SongArrayAdapter;

import java.util.List;

import butterknife.BindView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ArtistsActivity extends AppCompatActivity {
    @BindView(R.id.listView)
    ListView mListView;
    @BindView(R.id.errorTextView)
    TextView mErrorTextView;
    @BindView(R.id.progressBar)
    ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);


        com.wendyomollo.nipate.main.YoutubeApi client = com.wendyomollo.nipate.main.YoutubeClient.getClient();
        Call<com.wendyomollo.nipate.main.ArtistSearch> call = client.getVideos("id", "contentDetails");

        call.enqueue(new Callback<com.wendyomollo.nipate.main.ArtistSearch>() {
            @Override
            public void onResponse(Call<com.wendyomollo.nipate.main.ArtistSearch> call, Response<com.wendyomollo.nipate.main.ArtistSearch> response) {
                hideProgressBar();
                if (response.isSuccessful()) {
                    List<com.wendyomollo.nipate.main.Video> videoList= response.body().getVideos();
                    String[] artists = new String[videoList.size()];

                    for (int i = 0; i < artists.length; i++) {
                        artists[i] = videoList.get(i).getKind();
                    }

                    ArrayAdapter adapter = new SongArrayAdapter(ArtistsActivity.this,android.R.layout.simple_list_item_1,artists);
                    mListView.setAdapter(adapter);
                    showVideos();
                } else {
                    showUnsuccessfulMessage();
                }
            }

            @Override
            public void onFailure(Call<com.wendyomollo.nipate.main.ArtistSearch> call, Throwable t) {
                hideProgressBar();
                showFailureMessage();
            }
        });
    }
    private void showFailureMessage() {
        mErrorTextView.setText("Something went wrong. Please check your Internet connection and try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showUnsuccessfulMessage() {
        mErrorTextView.setText("Something went wrong. Please try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showVideos() {
        mListView.setVisibility(View.VISIBLE);
    }

    private void hideProgressBar() {
        mProgressBar.setVisibility(View.GONE);
    }


}
