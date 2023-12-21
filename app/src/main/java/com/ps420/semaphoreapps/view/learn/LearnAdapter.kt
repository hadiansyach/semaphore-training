package com.ps420.semaphoreapps.view.learn

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.ps420.semaphoreapps.R
import com.ps420.semaphoreapps.model.Constants.SEMAPHORE_DATA
import com.ps420.semaphoreapps.model.LearnData

class LearnAdapter(private val getActivity: LearnActivity, private val listSemaphore: List<LearnData>) : RecyclerView.Adapter<LearnAdapter.ListViewHolder>() {
    class ListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val semaphoreImage : ImageView = itemView.findViewById(R.id.ivItemSemaphore)
        val semaphoreName : TextView = itemView.findViewById(R.id.tvItemSemaphore)
        val semaphoreCardView : CardView = itemView.findViewById(R.id.itemCardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.learn_item, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listSemaphore.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.semaphoreImage.setImageResource(listSemaphore[position].semaphoreImage)
        holder.semaphoreName.text = listSemaphore[position].semaphoreName
        holder.semaphoreCardView.setOnClickListener {
            val detailIntent = Intent(holder.itemView.context, LearnDetailActivity::class.java)
            detailIntent.putExtra(SEMAPHORE_DATA, listSemaphore[holder.adapterPosition])
            holder.itemView.context.startActivity(detailIntent)
        }
    }

}