package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

data class Pessoa(val nome:String, val dataDeNascimento: Date) : Movimentavel{

    var posicao:Posicao = Posicao(0,0)
    var carta: Carta = Carta("")
    val veiculos = mutableListOf<Veiculo>()
    override fun toString(): String {
        return "Pessoa | $nome | $dataDeNascimento | Posicao | x:${posicao.x} | y:${posicao.y}"
    }

    fun comprarVeiculo(veiculo: Veiculo){
        veiculos.add(veiculo)
    }

    fun venderVeiculo(identificador: String, pessoa: Pessoa){
        val avender = veiculos.find { it.identificador == identificador}
        if (avender!=null) {
            veiculos.remove(avender)
            pessoa.comprarVeiculo(avender)
        }else{
            //manda aquela cena
        }
    }

    fun pesquisarVeiculo(identificador: String){

    }

    fun moverVeiculoPara(identificador: String, x: Int, y: Int){

    }

    fun temCarta(): Boolean{
        return carta.dataTirada.toString() != ""
    }

    fun tirarCarta(){

    }

}