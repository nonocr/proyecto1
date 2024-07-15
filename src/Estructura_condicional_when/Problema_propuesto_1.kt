package Estructura_condicional_when

fun main() {
    print("Ingrese un numero")
    val num = readln().toInt()

    when{
        num > 0 -> println("El numero es positivo")
        num < 0 -> println("El numero es negativo")
        else -> println("El numero es nulo")
    }



}
