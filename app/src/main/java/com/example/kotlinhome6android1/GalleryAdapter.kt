package com.example.kotlinhome6android1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnLongClickListener
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.coroutines.withContext


class GalleryAdapter(
    private val galleryList: ArrayList<GalleryModel>,
    private val onItemClickListener: OnItemClickListener
) :
    RecyclerView.Adapter<GalleryAdapter.PhotoViewHolder>(), View.OnClickListener,
    OnLongClickListener {

    inner class PhotoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private var ivPhoto: ImageView? = null
        private var id: TextView? = null

        init {
            ivPhoto = view.findViewById(R.id.iv_photo)
            id = view.findViewById(R.id.iv_id)
        }

        fun onBind(photo: GalleryModel) {
            ivPhoto?.let {
                Glide.with(it.context).load(photo.photoUrl).into(it)
            }
            itemView.tag = photo
            id?.text = photo.id.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        return PhotoViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_photo, parent, false)
        )
    }

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {

        holder.itemView.setOnClickListener(this)
        holder.itemView.setOnLongClickListener(this)
        holder.onBind(galleryList[position])
        holder.itemView.setOnLongClickListener{

            galleryList.removeAt(holder.adapterPosition)
            notifyItemRemoved(holder.adapterPosition)
            true

        }
    }

    override fun getItemCount(): Int {
        return galleryList.size;
    }

    override fun onClick(view: View?) {
        onItemClickListener.onClick(view?.tag as GalleryModel)
    }

    override fun onLongClick(view: View?): Boolean {
        onItemClickListener.onLongClick(view?.tag as GalleryModel)
        return true
    }

}