package jaze.com.nytimesapp.ui.viewholders

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ProgressBar
import kotlinx.android.synthetic.main.footer_view.view.*

/**
 * View holder for Footer view
 *
 * @param itemView the view.
 */
class FooterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var progressBar: ProgressBar

    init {
        progressBar = itemView.progress_bar
    }
}