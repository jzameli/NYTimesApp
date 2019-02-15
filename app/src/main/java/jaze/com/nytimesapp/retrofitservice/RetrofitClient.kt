package jaze.com.nytimesapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Retrofit Api Client
 */
class RetrofitClient {
    private lateinit var retrofit: Retrofit

    companion object {
        val BASE_URL = "https://api.nytimes.com/"
    }

    /**
     * Get an instance of retrofit client
     *
     * @return returns the intance.
     */
    fun getRetrofitClient(): Retrofit {
        retrofit = retrofit2.Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit
    }
}