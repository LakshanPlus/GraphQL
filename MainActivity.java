package com.lakshan.app.activity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.exception.ApolloException;
import com.lakshan.app.AllVideosQuery;
import com.lakshan.app.app.GraphQLApplication;
import com.lakshan.app.graphql.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        executeSampleQuery();
    }

    private void executeSampleQuery() {
        ApolloClient apolloClient = GraphQLApplication.getApolloClient();
        apolloClient.query(new AllVideosQuery()).enqueue(new ApolloCall.Callback<AllVideosQuery.Data>() {
            @Override
            public void onResponse(@NonNull Response<AllVideosQuery.Data> response) {
                //TODO success callback
            }

            @Override
            public void onFailure(@NonNull ApolloException e) {
                //TODO error handling
            }
        });
    }
}