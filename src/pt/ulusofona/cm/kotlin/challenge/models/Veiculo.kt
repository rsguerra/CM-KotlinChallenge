package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimental

open class Veiculo(val identificador:String) : Movimental{

    var posicao: Posicao = Posicao(0,0)
    var dataDeAquisicao: Date = Date(0,0,0)


    open fun requerCarta(): Boolean{
        return false
    }

    override fun toString(): String {
        return "Veiculo | $identificador | Posicao $posicao | Data de Aquisição $dataDeAquisicao"
    }
}
