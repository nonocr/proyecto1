package Funciones_parametros_valor_por_defecto
fun sumaValores(num1: Int, num2: Int, num3: Int = 0, num4: Int = 0, num5: Int = 0) = num1 + num2 + num3 + num4 + num5

fun main() {
    println("La suma de 1 + 2 + 3 es ${sumaValores(1, 2, 3)}")
    println("La suma de 1 + 2 + 3 + 4 es ${sumaValores(1, 2, 3, 4)}")
    println("La suma de 1 + 2 + 3 + 4 + 5 es ${sumaValores(1, 2, 3, 4, 5)}")
}