package com.application.betvictorsports

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(
    val onItemClicked: OnContentClickListener
): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    //Title and Description
    private var titles = arrayOf("Victor Odds Tip1", "Victor Odds Tip2", "Victor Odds Tip3",
        "Victor Odds Tip4", "Victor Odds Tip5", "Victor Odds Tip6", "Victor Odds Tip7",
        "Victor Odds Tip8")
    private var details = arrayOf("Earn While You Learn",
    "How do you increase the odds?",
        "Victor Odds",
        "Victor Odds Offers Variety",
        "Betting Options",
        "Current Specials",
        "Customer Service",
        "Responsible Gambling")

    private var contents = intArrayOf(R.string.title1_con, R.string.title2_con, R.string.title3_con, R.string.title4_con, R.string.title5_con, R.string.title6_con, R.string.title7_con, R.string.title8_con)

    //Images
    private var images = intArrayOf(R.drawable.er1, R.drawable.bv2, R.drawable.bv3, R.drawable.bv4, R.drawable.sb7, R.drawable.bv6, R.drawable.bv7, R.drawable.res1)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }
    override fun getItemCount(): Int {
        return titles.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])

        holder.itemView.setOnClickListener {
            onItemClicked.OnContentItemClicked(images[position], contents[position])
        }
    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView = itemView.findViewById(R.id.item_image)
        var itemTitle: TextView = itemView.findViewById(R.id.item_title)
        var itemDetail: TextView = itemView.findViewById(R.id.item_detail)
    }
}
