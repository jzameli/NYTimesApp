package jaze.com.nytimesapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import jaze.com.nytimesapp.model.Result
import jaze.com.nytimesapp.ui.viewholders.FooterViewHolder

/**
 * Aadapter that displays a list of Articles in a RecyclerView.
 */
class ArticleAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val TYPE_FOOTER = 1
    private var articles: ArrayList<Result> = ArrayList()
    private var showFooterView = true

    override fun getItemCount(): Int {
        return articles.size
    }

    override fun getItemViewType(position: Int): Int {
        return if (position == articles.size-1) {
            return TYPE_FOOTER
        } else {
            super.getItemViewType(position)
        }

    }
    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, i: Int) {
        if (viewHolder is FooterViewHolder) {
            if (showFooterView) {
                viewHolder.progressBar.visibility = View.VISIBLE
            } else {
                viewHolder.progressBar.visibility = View.GONE
            }
        }
        else if (viewHolder is ArticleViewHolder) {
            viewHolder.name.text = articles[i].slugName
            viewHolder.title.text = articles[i].title

            if (!articles[i].thumbnailStandard.isEmpty()) {
                Picasso.get()
                    .load(articles[i].thumbnailStandard)
                    .into(viewHolder.thumbnail);
            }
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): RecyclerView.ViewHolder {
        val view: View
        val viewHolder : RecyclerView.ViewHolder
        if (i == TYPE_FOOTER) {
            view = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.footer_view, viewGroup, false)
            viewHolder = FooterViewHolder(view)
        }
        else {
            view = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.card_view, viewGroup, false)
            viewHolder = ArticleViewHolder(view)
        }

        return viewHolder
    }

    /**
     * Sets the data to be displayed
     * @param articles the data
     */
    fun setArticles(articles: List<Result>) {
        this.articles.addAll(articles)
        notifyDataSetChanged()
    }

    /**
     * Shows or hides the footer view
     * @param show if true shows footer view , otherwise hide it
     */
    fun showFooterView(show: Boolean) {
        showFooterView = show
    }
}
