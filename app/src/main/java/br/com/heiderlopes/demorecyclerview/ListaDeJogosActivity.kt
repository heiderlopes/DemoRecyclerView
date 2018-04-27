package br.com.heiderlopes.demorecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import br.com.heiderlopes.demorecyclerview.adapter.JogoAdapter
import br.com.heiderlopes.demorecyclerview.model.Jogo
import kotlinx.android.synthetic.main.activity_lista_de_jogos.*

class ListaDeJogosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_de_jogos)

        rvMeusJogos.adapter = JogoAdapter(jogos(), this, {
            Log.i("TAG", "MEU ITEM")
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
                        "God of War é um jogo eletrônico de ação-aventura desenvolvido pela SIE Santa Monica Studio e publicado pela Sony Interactive Entertainment. Foi lançado em 20 de abril de 2018 para o PlayStation 4. É o oitavo jogo da série God of War e a sequência dos eventos ocorridos em God of War III. O título é um recomeço para a franquia e leva a série para o mundo da mitologia nórdica — todos os jogos anteriores tinham como cenário a mitologia grega. Kratos retorna como o protagonista e agora tem ao seu lado um filho chamado Atreus. Kratos atua como um mentor e protetor de Atreus e tem de dominar a raiva que o impulsionou por muitos anos."))
    }
}
