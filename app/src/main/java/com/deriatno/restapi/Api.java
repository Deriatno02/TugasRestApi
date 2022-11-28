package com.deriatno.restapi;

import retrofit2.Call;
import retrofit2.http.GET;

public  class Api {
    public static String BASE_URL;
    String getBaseUrlASE_URL = "https://pokeapi.co/api/v2/";

    @GET("pokemon?limit=10")
    Call<PokemonPojo> getPokemons() {
        return null;
    }
}
