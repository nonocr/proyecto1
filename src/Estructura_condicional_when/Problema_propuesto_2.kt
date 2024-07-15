package Estructura_condicional_when

fun main() {
    var mayor = 0
for (nums in 1..5){
    println("Ingrese el primer numero:")
    val num1 = readln().toInt()
    println("Ingrese el segundo numero:")
    val num2 = readln().toInt()
    println("Ingrese el tercer numero:")
    val num3 = readln().toInt()
    mayor += when {
        num1 > num2 && num1 > num3 -> num1
        num2 > num1 && num2 > num3 -> num2
        else -> num3
    }
    }
    println("El valor acumulado de los numeros mayores es: $mayor")
}