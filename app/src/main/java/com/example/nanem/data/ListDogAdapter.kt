package com.example.nanem.data

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.nanem.R
import com.example.nanem.activity.DetailTanahActivity

class ListDogAdapter (private val listDog: ArrayList<Tanah>) :
    RecyclerView.Adapter<ListDogAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_tanah, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listDog.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val dog = listDog[position]
        Glide.with(holder.itemView.context)
            .load(dog.photo)
            .apply(RequestOptions().override(450, 450))
            .into(holder.imgPhoto)
        holder.tvName.text = dog.name
        holder.tvDetail.text = dog.detail
        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {

                val moveWithDataIntent = Intent(mContext, DetailTanahActivity::class.java)
                moveWithDataIntent.putExtra(DetailTanahActivity.EXTRA_NAME, dog.name)
                moveWithDataIntent.putExtra(DetailTanahActivity.EXTRA_DETAIL, dog.detail)
                moveWithDataIntent.putExtra(DetailTanahActivity.EXTRA_PHOTO, dog.photo)
                mContext.startActivities(arrayOf(moveWithDataIntent))
            }
        }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {

    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Tanah)
    }
    }
