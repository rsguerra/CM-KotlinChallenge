package pt.ulusofona.cm.kotlin.challenge.interfaces

interface Ligavel {

    var ligado: Boolean

    fun ligar() {
        ligado = true
    }

    fun desligar() {
        ligado = false
    }

    fun estaLigado(): Boolean {
        return ligado
    }
}