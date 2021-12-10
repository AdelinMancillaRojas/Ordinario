package com.example.ordinario.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ordinario.Model.Criptomoneda
import com.example.ordinario.R
import com.example.ordinario.databinding.ActivityMainBinding
import com.example.ordinario.databinding.CoinLayoutBinding

class CriptoAdapter(private val listcripto:List<Criptomoneda>): RecyclerView.Adapter<CriptoAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding: CoinLayoutBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(coin:Criptomoneda){
            binding.coinname.text=coin.nombre
            Glide.with(binding.root).load(coin.logo).centerCrop().placeholder(R.drawable.ic_launcher_background).into(binding.logo)
            binding.pricemx.text=coin.precio.toString()
            binding.porcent.text=coin.porcentaje.toString()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding= CoinLayoutBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listcripto[position])

    }

    override fun getItemCount(): Int {
        return listcripto.count()
    }


}