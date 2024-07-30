package Arreglos

fun main() {
    val elementos = IntArray(8)
    var acumulado = 0
    for (i in 0..elementos.size - 1) {
        println("Ingrese un elemento: ")
        elementos[i] = readln().toInt()
        acumulado += elementos[i]
        println("El acumulado es $acumulado")
    }
    var mayor36 = 0
    var mayor50 = 0
    for (i in 0..elementos.size - 1) {

        if (elementos[i] > 36) {
            mayor36++
        }

        if (elementos[i] > 50) {
            mayor50++
        }
    }
    println("Cantidad de elementos mayores a 36: $mayor36")
    println("Cantidad de elementos mayores a 50: $mayor50")
}