package com.wendyomollo.nipate.ux;


import com.wendyomollo.nipate.EventsApi;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.wendyomollo.nipate.ux.Constants.eventsApiKey;

public class EventsClient {

    private static Retrofit retrofit = null;

    public static EventsApi getEventVenues() {

        if (retrofit == null) {
            OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    .addInterceptor(new Interceptor() {
                        @Override
                        public Response intercept(Chain chain) throws IOException {
                            Request newRequest = chain.request().newBuilder()
                                    .addHeader("Authorization", eventsApiKey)
                                    .build();
                            return chain.proceed(newRequest);
                        }
                    })
                        .build();

            retrofit = new Retrofit.Builder()
                    .baseUrl(eventsApiKey)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit.create(EventsApi.class);
    }
}