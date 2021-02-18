package pt.ulusofona.cm.kotlin.challenge.models

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

data class Carta(val identificador:String){

    var formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
    var dataTirada: String = LocalDate.parse("01-01-2000", formatter).toString()


    override fun toString(): String {
        return "Carta | $identificador | $dataTirada"
    }
}
