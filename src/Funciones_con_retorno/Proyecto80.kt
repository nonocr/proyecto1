package Funciones_con_retorno
fun retornarMayor(v1: Int, v2: Int): Int{
    if (v1 > v2)
        return v1
    else
        return v2
}
fun main() {
    print("Ingrese el primer valor: ")
    val v1 = readln().toInt()
    println("Ingrese el segundo valor ")
    val v2 = readln().toInt()
    println("El mayor entre $v1 y $v2 es: ${retornarMayor(v1, v2)}")
}