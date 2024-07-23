package Funciones_con_expresion_unica
fun retornarPerimetro(lado: Int) = lado * 4

fun main() {
    print("Ingrese el lado del cuadrado:")
    val lado = readln().toInt()
    print("El perimetro es: ${retornarPerimetro(lado)}")
}