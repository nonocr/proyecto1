package Funciones_con_retorno
fun retornarSuperficie(ladoP: Int): Int{
val sup = ladoP * ladoP
return sup
     }
fun main() {
print("Ingrese el valor del lado del cuadrado: ")
    val lado = readln().toInt()
    val superficie = retornarSuperficie(lado)
    println("La superficie del cudrado es: $superficie")
}