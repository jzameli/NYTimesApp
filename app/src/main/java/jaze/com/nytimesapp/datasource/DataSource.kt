package jaze.com.nytimesapp.ui.datasource

import jaze.com.nytimesapp.DataListener
import jaze.com.nytimesapp.RetrofitClient
import jaze.com.nytimesapp.RetrofitInterface
import jaze.com.nytimesapp.model.Articles
import jaze.com.nytimesapp.model.Result
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Class for consuming Times Newswire API.
 *
 * @param listener the listener for data updates.
 */
class DataSource(listener: DataListener) {
    private var client: RetrofitInterface
    private var limit: Int = 50
    private var offset: Int = 0
    private var maxNumResults: Int = 0
    private var listener: DataListener

    companion object {
        val API_KEY = "KAjlhv4LJqDHTk1t66tCXCzNIvJC2mSF"
    }

    /**
     * Constructor
     */
    init {
        this.listener = listener
        this.client = RetrofitClient()
            .getRetrofitClient().create(RetrofitInterface::class.java)
    }

    /**
     * Get the list of articles asynchronously
     */
    fun getArticles() {
        val call = client.getArticles(API_KEY, offset, limit)
        call.enqueue(object : Callback<Articles> {
            override fun onResponse(call: Call<Articles>, response: Response<Articles>) {
                if (response.isSuccessful()) {
                    updateOffset()
                    val body = response.body()
                    maxNumResults = body?.getNumResults() ?: 0
                    listener.onShowData(body?.getResults() as List<Result>)
                } else {
                    listener.onShowError(response.message())
                }
            }

            override fun onFailure(call: Call<Articles>, t: Throwable) {
                t.printStackTrace()
            }
        })
    }

    /**
     * Update the offset position
     */
    fun updateOffset() {
        offset = offset + limit + 1

        if (offset >= maxNumResults) {
            listener.onReachTheEnd()
        }
    }
}