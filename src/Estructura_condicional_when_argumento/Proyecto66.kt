package Estructura_condicional_when_argumento

fun main() {
    print("Ingrese un valor entero entre 1 y 5:")
    val valor = readln().toInt()
    when(valor){
        1 -> println("Uno")
        2 -> println("Dos")
        3 -> println("Tres")
        4 -> println("Cuatro")
        5 -> println("Cinco")
        else -> println("Valor fuera de rango")
    }
}