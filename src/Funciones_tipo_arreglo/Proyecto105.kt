package Funciones_tipo_arreglo
fun cargar(arreglo:IntArray){
    for(i in arreglo.indices){
        println("Ingrese un elemento: ")
        arreglo[i] = readln().toInt()
    }
}
fun imprimir(arreglo: IntArray){
    for(i in arreglo)
        for(i in arreglo)
    println(i)
}
fun main() {
    val arre = IntArray(5)
    cargar(arre)
    imprimir(arre)
}