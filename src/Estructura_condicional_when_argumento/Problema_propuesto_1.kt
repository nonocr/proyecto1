package Estructura_condicional_when_argumento

fun main() {
    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    var cant4 = 0
    for (i in 1..10){
        print("Ingrese la cantidad de hijos en la familia:")
        val valor = readln().toInt()
        when(valor){
            0 -> cant1++
            1 -> cant2++
            2 -> cant3++
            else -> cant2++
        }
    }
    println("La cantidad de familias sin hijos es:$cant1")
    println("La cantidad de familias con 1 hijo es:$cant2")
    println("La cantidad de familias con 2 hijos es:$cant3")
    println("La cantidad de familias con mas de 2 hijos es:$cant4")


}