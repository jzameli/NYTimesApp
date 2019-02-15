package jaze.com.nytimesapp

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.card_view.view.*

/**
 * View holder for Article view
 *
 * @param itemView the view.
 */
class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var name: TextView
    var title: TextView
    var thumbnail: ImageView

    init {
        name = itemView.name
        title = itemView.title
        thumbnail = itemView.thumbnail
    }
}