package Colaboraciones_de_clases

class Socio(val nombre: String, val antigüedad: Int) {
    fun imprime() {
        println("El socio $nombre tiene una antigüedad en el club de $antigüedad años")
    }
}

class Club {
    val socio1 = Socio("elpepe", 12)
    val socio2 = Socio("etesech", 22)
    val socio3 = Socio("Jhony", 18)

    fun viejo() {
        socio1.imprime()
        socio2.imprime()
        socio3.imprime()
        print("El socio con mayor antigüedad es: ")
        when {
            socio1.antigüedad > socio2.antigüedad && socio1.antigüedad > socio3.antigüedad -> print(socio1.nombre)
            socio2.antigüedad > socio1.antigüedad && socio2.antigüedad > socio3.antigüedad -> print(socio2.nombre)
            else -> print(socio3.nombre)
        }
    }
}

fun main() {
    val SocioAntiguo = Club()
    SocioAntiguo.viejo()
}
