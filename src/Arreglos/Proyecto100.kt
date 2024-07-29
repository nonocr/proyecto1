package Arreglos

fun main() {
    val arreglo = IntArray(10)
    for(i in 0..arreglo.size-1){
        println("Ingrese elemento: ")
        arreglo[i] = readln().toInt()
    }
    var ordenado = true
    for( i in 0..arreglo.size-2)

        if(arreglo[i + 1] < arreglo[i])
            ordenado = false
    if (ordenado)
        println("Los elementos estan ordenados de menor a mayor")
    else
        println("Los elementos estan ordenados de mayor a menor")
}