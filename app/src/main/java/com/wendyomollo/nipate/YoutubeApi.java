package com.wendyomollo.nipate;

import com.wendyomollo.nipate.models.ArtistSearch;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface YoutubeApi {
    String YOUTUBE_BASE_URL = "https://www.googleapis.com/youtube/v3/videos";
    @GET("/videos{34456}")
    Call<ArtistSearch> getVideos(
            @Query("id") String id,
            @Query("contentDetails") String contentDetails
    );
}
