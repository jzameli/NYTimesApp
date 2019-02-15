package jaze.com.nytimesapp

import jaze.com.nytimesapp.model.Result

/**
 * Listener to observe data changes
 */
interface DataListener {
    fun onShowData(data: List<Result>)
    fun onReachTheEnd()
    fun onShowError(error: String)
}