package Estructura_condicional_when_argumento

fun main() {
    print("Ingrese un valor entero positivo comprendido entre 1 y 99999")
    val valor = readln().toInt()
    when(valor){
        in 1..9 -> println("Tiene 1 digito")
        in 10..99 -> println("Tiene 2 digito")
        in 100..999 -> println("Tiene 3 digito")
        in 1000..9999 -> println("Tiene 4 digito")
        in 10000..99999 -> println("Tiene 5 digito")
        else -> println("No se encuentra en el rango indicado")
    }
}