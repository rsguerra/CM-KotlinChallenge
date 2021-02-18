package pt.ulusofona.cm.kotlin.challenge.models

class Carro(identificador: String, motor:Motor) : Veiculo(identificador){

    override fun toString(): String {
        return "Carro | $identificador | $dataDeAquisicao | Posicao | x:${posicao.x} | y:${posicao.y}"
    }

    override fun requerCarta(): Boolean {
        return true
    }
}