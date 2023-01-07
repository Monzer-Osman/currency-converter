package com.example.calculator.Interfaces;

import com.example.calculator.Model.Currency;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ApiInterface{
    @GET
    Call<Currency> getCurrencyRatesUSD(@Url String url);

    @GET
    Call<Currency> getCurrencyRates(@Url String url);

}
