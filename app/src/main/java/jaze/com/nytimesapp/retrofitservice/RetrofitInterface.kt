package jaze.com.nytimesapp

import jaze.com.nytimesapp.model.Articles
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Retrofit interface
 */
interface RetrofitInterface {

    /**
     * Get real-time feed of NYT articles
     *
     * @param api-key the application key.
     * @param offset the starting point of the result set.
     * @param limit limits the number of results.
     * @return true if this view can be scrolled in the specified direction, false otherwise.
     */
    @GET("/svc/news/v3/content/all/technology.json?")
    fun getArticles(@Query("api-key") key: String, @Query("offset") offset: Int, @Query("limit") limit: Int): Call<Articles>
}