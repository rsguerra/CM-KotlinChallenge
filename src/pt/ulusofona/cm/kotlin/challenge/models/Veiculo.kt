package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

open class Veiculo(val identificador:String) : Movimentavel{

    var posicao: Posicao = Posicao(0,0)
    var formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
    var dataDeAquisicao: String = LocalDate.parse("01-01-2000", formatter).toString()


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
