package com.wendyomollo.nipate;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.wendyomollo.nipate.R;
import com.wendyomollo.nipate.SongArrayAdapter;
import com.wendyomollo.nipate.models.ArtistSearch;
import com.wendyomollo.nipate.models.Video;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ArtistsActivity extends Activity {
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
        ButterKnife.bind(this);
        Intent intent = getIntent();

        com.wendyomollo.nipate.YoutubeApi client = com.wendyomollo.nipate.YoutubeClient.getClient();
        Call<ArtistSearch> call = client.getVideos();
        call.enqueue(new Callback<ArtistSearch>() {
            @Override
            public void onResponse(Call<ArtistSearch> call, Response<ArtistSearch> response) {
                hideProgressBar();
                if (response.isSuccessful()) {
                    List<Video> videoList = response.body().getVideos();
                    String[] artists = new String[videoList.size()];

                    for (int i = 0; i < artists.length; i++) {
                        artists[i] = videoList.get(i).getKind();
                    }

                    ArrayAdapter adapter = new SongArrayAdapter(ArtistsActivity.this, android.R.layout.simple_list_item_1, artists);
                    mListView.setAdapter(adapter);
                    showVideos();
                } else {
                    showUnsuccessfulMessage();
                }
            }

            @Override
            public void onFailure(Call<ArtistSearch> call, Throwable t) {
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