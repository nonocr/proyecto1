package Estructura_repetitiva_for

fun main() {
    var apro = 0
    var repro = 0

    for (index in 1..10) {
        println("Ingrese nota $index: ")
        val nota = readln().toInt()
        if (nota >= 7) {
            apro++
        } else {
            repro++
        }
    }
    println("Cantidad de alumnos con notas mayores o "+
    "iguales a 7: $apro")
    println("Cantidad de alumnos con notas menores a 7: $apro")
}
