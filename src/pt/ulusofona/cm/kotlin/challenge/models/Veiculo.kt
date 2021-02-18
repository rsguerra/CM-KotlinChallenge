package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

open class Veiculo(val identificador:String) : Movimentavel{

    var posicao: Posicao = Posicao(0,0)
    lateinit var dataDeAquisicao: Date


    open fun requerCarta(): Boolean{
        return false
    }

    override fun toString(): String {
        return "Veiculo | $identificador | Posicao $posicao | Data de Aquisição $dataDeAquisicao"
    }

    override fun moverPara(x: Int, y: Int) {
        posicao.alterarPosicaoPara(x,y)
    }
}
