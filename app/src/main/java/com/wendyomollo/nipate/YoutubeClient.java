package com.wendyomollo.nipate;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.wendyomollo.nipate.BuildConfig.API_KEY;


public class YoutubeClient {
    private static Retrofit retrofit = null;
    private static String YOUTUBE_BASE_URL = "https://www.googleapis.com/youtube/v3/watch?";

    public static YoutubeApi getClient() {
        if(retrofit == null){
            OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    .addInterceptor(new Interceptor() {
                        @Override
                        public Response intercept(Chain chain) throws IOException {
                           Request newRequest = chain.request().newBuilder()
                                   .addHeader("Authorization",API_KEY)
                                   .build();
                            return chain.proceed(newRequest);
                        }
                    })
                    .build();
            retrofit = new Retrofit.Builder()
                    .baseUrl(YOUTUBE_BASE_URL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(YoutubeApi.class);
}
}
