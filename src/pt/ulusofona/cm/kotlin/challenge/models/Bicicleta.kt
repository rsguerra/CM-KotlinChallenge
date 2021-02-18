package pt.ulusofona.cm.kotlin.challenge.models

class Bicicleta(identificador: String) : Veiculo(identificador){

    override fun toString(): String {
        return "Bicicleta | $identificador | $dataDeAquisicao | Posicao | x:${posicao.x} | y:${posicao.y}"
    }

    override fun requerCarta(): Boolean {
        return false
    }
}