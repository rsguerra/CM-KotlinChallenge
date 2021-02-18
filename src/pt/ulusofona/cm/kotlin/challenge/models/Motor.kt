package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

data class Motor(val cavalos:Int, private val cilindrada:Int): Ligavel{

    var ligado:Boolean = estaLigado()

    override fun toString(): String {
        return "Motor | $cavalos | $cilindrada"
    }
}
