package com.example.recyclerviewexample4

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class NotaAdapter(val listaNota: List<NotaItem>, context:Context) : RecyclerView.Adapter<NotaAdapter.NotaViewHolder>() {

    val context:Context = context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotaViewHolder {
        val notaViewCriada =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return NotaViewHolder(notaViewCriada,context)
    }


    override fun onBindViewHolder(holder: NotaViewHolder, position: Int) {
        val notaItemAtual = listaNota[position]

        holder.textView1.text = notaItemAtual.filme
        holder.textView2.text = notaItemAtual.descricao
    }

    override fun getItemCount(): Int {
        return listaNota.size
    }

    class NotaViewHolder(itemView: View, val context: Context) : RecyclerView.ViewHolder(itemView) {

        val textView1: TextView = itemView.text_view_1
        val textView2: TextView = itemView.text_view_2

        val clique = itemView.setOnClickListener({
            Toast.makeText(context, "O ${itemView.text_view_1} foi clicado", Toast.LENGTH_SHORT).show()
        })

    }
}