package jaze.com.nytimesapp.ui.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import jaze.com.nytimesapp.ArticleAdapter
import jaze.com.nytimesapp.DataListener
import jaze.com.nytimesapp.R
import jaze.com.nytimesapp.model.Result
import jaze.com.nytimesapp.ui.datasource.DataSource
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), DataListener {
    private val mAdapter = ArticleAdapter()
    private val dataSource = DataSource(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view.apply {
            this?.layoutManager = LinearLayoutManager(this?.context)
            this?.addOnScrollListener(onScrollListener)
            this?.adapter = mAdapter
        }

        loadData()
    }

    /**
     * Data listener methods
     */
    override fun onShowData(data: List<Result>) {
        mAdapter.setArticles(data)
    }

    /**
     * Callback method to inform that no more data is available
     */
    override fun onReachTheEnd() {
        mAdapter.showFooterView(false)
    }

    /**
     * Callback method to inform error
     */
    override fun onShowError(error: String) {
        Toast.makeText(this, error, Toast.LENGTH_LONG).show()
    }

    /**
     * Detects when the RecyclerView reaches the bottom and load more data
     */
    var onScrollListener = object : RecyclerView.OnScrollListener() {
        override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
            if (dy > 0) {
                if(recyclerView.canScrollVertically(RecyclerView.FOCUS_DOWN) == false){
                    loadData()
                }
            }
        }
    }

    /**
     * Gets data from API service
     */
    fun loadData() {
        dataSource.getArticles()
    }
}
