package com.example.triviaquizoblig3.API;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TriviaService {
    @GET("/api.php")
    Single<TriviaResult> getQuizResults(
            @Query("amount") int amount,
            @Query("category") int category,
            @Query("difficulty") String difficulty,
            @Query("type") String type);
}
