package Colaboraciones_de_clases

class Dado(var valor: Int) {

    fun tirar() {
        valor = ((Math.random() * 6) + 1).toInt()
        imprimir()
    }

    fun imprimir() {
        println("Valor de dado: $valor")
    }
}

class JuegoDeDados {
    val dado1 = Dado(1)
    val dado2 = Dado(1)
    val dado3 = Dado(1)

    fun jugar() {
        var resultado = false
        var cantidad = 0

        while (resultado != true) {
            dado1.tirar()
            dado2.tirar()
            dado3.tirar()

            if (dado1.valor == dado2.valor && dado2.valor == dado3.valor) {
                resultado = true
                println("Gano")
            } else {
                resultado = false
                cantidad++
            }
            println("El jugador jugo $cantidad veces")
        }
    }
}

fun main() {
    val juego1 = JuegoDeDados()
    juego1.jugar()
}

