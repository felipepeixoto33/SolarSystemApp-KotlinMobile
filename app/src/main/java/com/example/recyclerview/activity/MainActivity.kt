package com.example.recyclerview.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.adapter.OnUserItemClickListener
import com.example.recyclerview.adapter.UserAdapter
import com.example.recyclerview.repository.PlanetsRepository

class MainActivity : AppCompatActivity(), OnUserItemClickListener {

    private lateinit var mList: RecyclerView
    val users = PlanetsRepository.getAllPlanets()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val llm = LinearLayoutManager(this)
        val userAdapter = UserAdapter(users)
        userAdapter.setOnUserItemListener(this)

        mList = findViewById(R.id.main_recyclerview_list)
        mList.apply {
            adapter = userAdapter //Diz ao recyclerview como renderizar seus itens na tela.
            layoutManager = llm   //Como os itens serao dispostos na tela.
            hasFixedSize()        //Usar só se a lista tiver tam. fixo. Acelera o programa.
        }


    }

    override fun onClick(view: View, position: Int) {

        val iName:TextView = findViewById(R.id.user_item_textview_name)

        val it = Intent(this, DetailActivity::class.java) //Cria um intent que se comunica com o SO.
        it.putExtra("position", position)                         //Coloca dados no Intent
        startActivity(it)                                               //Inicia a activity ao qual o intent tem como parametro.

//        view.setOnClickListener {
//            Toast.makeText(
//                    view.context,
//                    "You clicked in the item with the name of ${users[position].name}",
//                    Toast.LENGTH_SHORT
//            ).show()
//        }

    }
}