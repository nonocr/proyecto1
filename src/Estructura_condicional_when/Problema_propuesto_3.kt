package Estructura_condicional_when

fun main() {
    var equilatero = 0
    var isosceles = 0
    var escaleno = 0
    for (t in 1..5){
    println("Ingrese el primer lado del triangulo:")
    val lado1 = readln().toInt()
    println("Ingrese el segundo lado del triangulo:")
    val lado2 = readln().toInt()
    println("Ingrese el tercer lado del triangulo:")
    val lado3 = readln().toInt()
    when {
        lado1 == lado2 && lado1 == lado3 -> {
        println("El triangulo es equilatero")
        equilatero++
        }
        lado1 == lado2 || lado1 == lado3 -> {
            println("El triangulo es isosceles")
            isosceles++
        }
        else ->  {
            println("El triangulo es escaleno")
        escaleno++
        }
    }
        }
    println("La cantidad de triangulos equilateros es: $equilatero")
    println("La cantidad de triangulos isosceles es: $isosceles")
    println("La cantidad de triangulos escaleno es: $escaleno")
}