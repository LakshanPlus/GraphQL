package com.lakshan.app.app;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.apollographql.apollo.ApolloClient;
import com.lakshan.app.Utils.ApolloUtils;

public class GraphQLApplication extends Application implements Application.ActivityLifecycleCallbacks {

    public static ApolloClient apolloClient;

    @Override
    public void onCreate() {
        super.onCreate();
        apolloClient = ApolloUtils.connectApolloClient();
    }

    @Override
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {

    }

    @Override
    public void onActivityStarted(@NonNull Activity activity) {

    }

    @Override
    public void onActivityResumed(@NonNull Activity activity) {

    }

    @Override
    public void onActivityPaused(@NonNull Activity activity) {

    }

    @Override
    public void onActivityStopped(@NonNull Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {

    }

    @Override
    public void onActivityDestroyed(@NonNull Activity activity) {

    }

    public static ApolloClient getApolloClient() {
        return apolloClient;
    }
}
