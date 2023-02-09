package com.example.zimamchanifushs_presidenku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter (private val dataSet:ArrayList<Datagambar>) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var data: ImageView = view.findViewById(R.id.tempatGambar)
        var judul: TextView =view.findViewById(R.id.tempatTeks)
        var Priode: TextView =view.findViewById(R.id.Harga)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflate = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_adapter, parent, false)
        return ViewHolder(inflate)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val DataGambar = dataSet[position]
        holder.data.setImageResource(DataGambar.gambar)
        holder.judul.text = DataGambar.nama
        holder.Priode.text = DataGambar.priode
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}