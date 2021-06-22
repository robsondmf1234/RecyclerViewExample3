package com.example.recyclerviewexample4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        val listaDeNotas = gerarNota(101)

        recyclerView.adapter = NotaAdapter(listaDeNotas,this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
    }

    private fun gerarNota(size: Int): List<NotaItem> {

        val list = ArrayList<NotaItem>()

        for (i in 1 until size) {
            val item = NotaItem(i,"Filme $i", "Descrição $i")
            list += item
        }
        return list
    }
}