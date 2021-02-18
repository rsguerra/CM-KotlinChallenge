package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

data class Carta(val identificador:String){

    lateinit var dataTirada: Date


    override fun toString(): String {
        return "Carta | $identificador | $dataTirada"
    }
}
