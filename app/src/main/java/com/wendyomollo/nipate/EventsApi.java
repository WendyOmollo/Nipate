package com.wendyomollo.nipate;

import com.wendyomollo.nipate.ArtistLinkUp.ArtistLinkUp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface EventsApi {

    @GET("events/search?")
    Call<ArtistLinkUp> getEventVenues(
            @Query("start_date.keyword") String today,
            @Query("token") String app_id

    );

}
