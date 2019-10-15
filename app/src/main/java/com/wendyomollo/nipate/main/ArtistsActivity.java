package com.wendyomollo.nipate.main;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridLayout;
import android.widget.GridView;

import com.wendyomollo.nipate.ArtistSearch;
import com.wendyomollo.nipate.R;
import com.wendyomollo.nipate.Video;

import java.util.List;

import butterknife.BindView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ArtistsActivity extends AppCompatActivity {
    @BindView(R.id.grid)
    GridLayout mGriddy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);
    }


    YoutubeApi client = YoutubeClient.getClient();
    Call<ArtistSearch> call = client.getVideos("id","contentDetails");
        call.enqueue(new Callback<ArtistSearch>(){
        @Override
        public void onResponse(Call<ArtistSearch> call, Response<ArtistSearch> response){
            if(response.isSuccessful){
                List<Video> videoList = response.body.setVideos();
                String[] artists = new String[videoList.size()];

                for(int i=0; i<artists.length;i++){
                    artists[i] = videoList.get(i).getKind();
                }

                GridView view = new GridView(ArtistsActivity.this);
                mGriddy.addView(view);
            }
        }
        @Override
                public void onFailure(Call<ArtistSearch>call,Throwable t){

        }

    });

}
