package com.wendyomollo.nipate.main;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface YoutubeApi {
    String YOUTUBE_BASE_URL = "https://www.youtube.com/";
    @GET("videos/search")
    Call<ArtistSearch> getVideos(
            @Query("id") String id,
            @Query("contentDetails") String contentDetails

    );
}
