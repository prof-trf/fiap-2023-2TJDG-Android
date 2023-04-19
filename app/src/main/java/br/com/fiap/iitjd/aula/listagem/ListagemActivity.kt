package br.com.fiap.iitjd.aula.listagem

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.iitjd.databinding.ActivityListagemBinding

class ListagemActivity: AppCompatActivity() {

    private lateinit var binding: ActivityListagemBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityListagemBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        binding.rcvListagem.layoutManager = layoutManager

        //val nomes = arrayOf("Caio", "Pedro", "Maria", "Alice", "Ana")
        val pessoas = arrayOf(
            Pessoa("Caio", "Ribeiro"),
            Pessoa("Pedro", "Sampaio"),
        )

        val listagemAdapter = ListagemAdapter(pessoas)
        binding.rcvListagem.adapter = listagemAdapter
        binding.rcvListagem.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    }

}