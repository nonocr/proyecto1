package Concepto_funciones
fun cuad(){
    println("Ingrese un numero entero:")
    val num = readln().toInt()
    val cuadrado = num * num
    println("El cuadrado del numero ingresado es: $cuadrado")
}
fun producto(){
    println("Ingrese un primer valor:")
    val num1 = readln().toInt()
    println("Ingrese un segundo valor:")
    val num2 = readln().toInt()
    val produ = num1 * num2
    println("El producto de los numeros ingresados es: $produ")
}
fun main() {
cuad()
    producto()
}