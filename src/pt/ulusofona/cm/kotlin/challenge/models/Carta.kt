package pt.ulusofona.cm.kotlin.challenge.models

data class Carta(val identificador:String){

    val dataTirada:Date = Date(0,0,0)


    override fun toString(): String {
        return "Carta | $identificador | $dataTirada"
    }
}
