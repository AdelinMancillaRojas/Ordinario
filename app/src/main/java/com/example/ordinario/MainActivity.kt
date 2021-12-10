package com.example.ordinario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ordinario.Model.Criptomoneda
import com.example.ordinario.adapter.CriptoAdapter
import com.example.ordinario.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cripto1 = cripto.get(0)
        val cripto2 = cripto.get(1)

        val binding= DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        val adapter= CriptoAdapter(cripto)

        binding.listcrip.layoutManager=LinearLayoutManager(this)
        binding.listcrip.adapter= adapter

    }

    val cripto = mutableListOf<Criptomoneda>(
        Criptomoneda(
            nombre = "BITCOIN",
            logo = "https://s2.coinmarketcap.com/static/img/coins/64x64/1.png",
            precio = 1012211.84,
            porcentaje = -2.43,
        ),
        Criptomoneda(
            nombre = " Ethereum ",
            logo = "https://s2.coinmarketcap.com/static/img/coins/64x64/1027.png",
            precio = 85635.76,
            porcentaje = 1.25,
        ),
        Criptomoneda(
            nombre = " Cardano ",
            logo = "https://s2.coinmarketcap.com/static/img/coins/64x64/2010.png",
            precio = 27.06,
            porcentaje = 0.02,
        ),
        Criptomoneda(
            nombre = " Tether ",
            logo = "https://s2.coinmarketcap.com/static/img/coins/64x64/825.png",
            precio = 21.02,
            porcentaje = 0.69,
        ),
        Criptomoneda(
            nombre = " Binance Coin ",
            logo = "https://s2.coinmarketcap.com/static/img/coins/64x64/1839.png",
            precio = 12109.35,
            porcentaje = 1.15,
        ),
        Criptomoneda(
            nombre = " XRP ",
            logo = "https://s2.coinmarketcap.com/static/img/coins/64x64/52.png",
            precio = 17.12,
            porcentaje = -8.87,
        ),
        Criptomoneda(
            nombre = " Dogecoin ",
            logo = "https://s2.coinmarketcap.com/static/img/coins/64x64/74.png",
            precio = 3.54,
            porcentaje = 0.07,
        ),
        Criptomoneda(
            nombre = " USDCoin ",
            logo = "https://s2.coinmarketcap.com/static/img/coins/64x64/3408.png",
            precio = 20.00,
            porcentaje = -0.56,
        ),
        Criptomoneda(
            nombre = " Polkadot ",
            logo = "https://s2.coinmarketcap.com/static/img/coins/64x64/6636.png",
            precio = 556.21,
            porcentaje = -1.69,
        ),
        Criptomoneda(
            nombre = " Solana ",
            logo = "https://s2.coinmarketcap.com/static/img/coins/64x64/5426.png",
            precio = 3705.64,
            porcentaje = -0.63,
        ),

    )




}