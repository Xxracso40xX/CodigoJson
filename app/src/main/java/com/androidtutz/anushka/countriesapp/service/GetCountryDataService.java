package com.androidtutz.anushka.countriesapp.service;

import com.androidtutz.anushka.countriesapp.model.Info;

import retrofit2.http.GET;
import retrofit2.Call;


public interface GetCountryDataService {



      @GET("country/get/all")
      Call<Info> getResults();








}
