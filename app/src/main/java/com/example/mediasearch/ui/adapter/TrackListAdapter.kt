package com.example.mediasearch.ui.adapter


import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.mediasearch.R


class TrackListAdapter(
    private val context: Context,
    private val sectionName: Array<String>,
    private val sectionPhoto1: Array<Int>,
    private val sectionPhoto2: Array<Int>,
    private val sectionPhoto3: Array<Int>

) : RecyclerView.Adapter<TrackListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.track_list_adapter, parent,false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.txtTitle?.text = sectionName[position]

        holder.imgTopRight?.setImageResource(sectionPhoto1[position])
        holder.imgTopLeft?.setImageResource(sectionPhoto2[position])
        holder.imgBottom?.setImageResource(sectionPhoto3[position])
    }

    override fun getItemCount(): Int {
        return sectionName.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var mainCardView: CardView? = null
        var txtTitle: TextView? = null
        var imgTopLeft: ImageView? = null
        var imgTopRight: ImageView? = null
        var imgBottom: ImageView? = null

        init {
            mainCardView = view.findViewById(R.id.mainCardView)
            txtTitle = view.findViewById(R.id.txtTitle)
            imgTopLeft = view.findViewById(R.id.imgTopLeft)
            imgTopRight = view.findViewById(R.id.imgTopRight)
            imgBottom = view.findViewById(R.id.imgBottom)
        }
    }

}



