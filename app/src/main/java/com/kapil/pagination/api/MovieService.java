package com.kapil.pagination.api;


import com.kapil.pagination.models.TopRatedMovies;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Pagination
 * Created by kapil on 10/27/16.
 * Copyright (c) 2016. kapil. All rights reserved.
 */

public interface MovieService {

    @GET("search/users")
    Call<TopRatedMovies> getTopRatedMovies(
            @Query("q") String apiKey,
            @Query("page") int language,
            @Query("per_page") String pageIndex
    );

}
