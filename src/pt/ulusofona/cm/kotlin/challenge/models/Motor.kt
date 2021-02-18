package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

data class Motor(var cavalos:Integer, var cilindrada:Integer): Ligavel{

    override var ligado:Boolean = estaLigado()

    override fun toString(): String {
        return "Motor | $cavalos | $cilindrada"
    }
}
