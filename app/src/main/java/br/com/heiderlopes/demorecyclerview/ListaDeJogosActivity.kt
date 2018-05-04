package br.com.heiderlopes.demorecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import br.com.heiderlopes.demorecyclerview.adapter.JogoAdapter
import br.com.heiderlopes.demorecyclerview.model.Jogo
import kotlinx.android.synthetic.main.activity_lista_de_jogos.*
import android.content.Intent


class ListaDeJogosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_de_jogos)

        rvMeusJogos.adapter = JogoAdapter(jogos(), this, {
            val detalheIntent = Intent(this, DetalheActivity::class.java)
            detalheIntent.putExtra("jogo", it)
            startActivity(detalheIntent)
        })

        //Grid
        //val layoutManager = GridLayoutManager(this, 2)


        //Grade escalonável
        /*val layoutManager = StaggeredGridLayoutManager(
                2, StaggeredGridLayoutManager.VERTICAL)*/

        //Lista na horizontal
        //val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        //Lista na vertical
        val layoutManager = LinearLayoutManager(this)

        rvMeusJogos.layoutManager = layoutManager
    }

    private fun jogos(): List<Jogo> {
        return listOf(
                Jogo(R.drawable.godofwar,
                        "God of War",
                        2018,
                        R.string.god_of_war_descricao,
                        R.drawable.god_of_war_back))
    }
}
