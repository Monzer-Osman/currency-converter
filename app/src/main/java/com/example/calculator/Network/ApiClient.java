package com.example.calculator.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static final String API_BASE_URL = "https://v6.exchangerate-api.com/v6/";
    private static final String API_KEY = "b3f2bc90260101ba5ce1ad6a/";

    private static Retrofit retrofit = null;
    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl(API_BASE_URL+API_KEY+"/latest/").addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
