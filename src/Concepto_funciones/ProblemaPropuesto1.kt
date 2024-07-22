package Concepto_Funciones

fun cuadrado(){
    print("Ingrese un numero entero:")
    val num = readln().toInt()
    val cuad = num*num
    println("El cuadrado del $num es $cuad")
    println("**************************")
}

fun producto(){
    print("Ingrese el primer numero entero:")
    val num1 = readln().toInt()
    print("Ingrese el segundo numero entero:")
    val num2 = readln().toInt()
    val prod = num1*num2
    println("El producto de los numeros es $prod")
}
fun main() {
    cuadrado()
    producto()
}

