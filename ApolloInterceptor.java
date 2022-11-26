package com.lakshan.app.Utils;

import androidx.annotation.NonNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class ApolloInterceptor implements Interceptor {

    @NonNull
    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {
        Request.Builder request = chain.request().newBuilder();
        request.addHeader("AUTHORIZATION_HEADER_PARAM", "AUTHORIZATION_HEADER_VAL_PREFIX");
        request.addHeader("AUTHORIZATION_SOURCE_HEADER_PARAM", "AUTHORIZATION_SOURCE_HEADER_VAL");
        return chain.proceed(request.build());
    }
}
