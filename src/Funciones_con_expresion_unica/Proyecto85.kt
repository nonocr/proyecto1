package Funciones_con_expresion_unica
fun retornarSuperficie(lado: Int) = lado * lado

fun main() {
println("Ingrese el valor del lado del cuadrado: ")
    val la = readln().toInt()
    println("La superficie del cuadrado es: ${retornarSuperficie(la)}")
}