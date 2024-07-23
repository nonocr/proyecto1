package Funciones_con_retorno
fun retornarPerimetro(lado: Int): Int {
    val perimetro = lado * 4
    return perimetro
}

fun main() {
    print("Ingrese el lado del cuadrado:")
    val lado = readln().toInt()
    print("El perimetro es: ${retornarPerimetro(lado)}")
}
