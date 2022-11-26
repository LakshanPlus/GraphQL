package com.lakshan.app.Utils;

import com.apollographql.apollo.ApolloClient;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

public class ApolloUtils {

    public static ApolloClient connectApolloClient() {
        return ApolloClient.builder().serverUrl("").okHttpClient(getHttpClient().addInterceptor(new ApolloInterceptor()).build()).build();
    }

    private static OkHttpClient.Builder getHttpClient() {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.readTimeout(50, TimeUnit.SECONDS);
        httpClient.connectTimeout(1, TimeUnit.MINUTES);
        httpClient.writeTimeout(15, TimeUnit.SECONDS);
        return httpClient;
    }

}
