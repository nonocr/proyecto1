package Funciones_tipo_arreglo

fun recorreMatriz1(matriz: Array<IntArray>){
    for(fila in (0 until matriz.size)){
        println()
        for(columna in(0 until matriz[fila].size))
            println("posicion[$fila][$columna] : ${matriz[fila][columna]}" )
    }
    fun recorreMatriz2(matriz: Array<IntArray>){
        for(i in matriz.indices){
            println()
            for(j in matriz[i].indices)
                println("posicion[$i][$j] : ${matriz[i][j]}")
        }
    }
}

fun main() {
    var matriz = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9),
        intArrayOf(10, 11, 12, 13, 14),
    )

    //Recorre la matriz y muestra sus valores

    println(matriz[0][0]) //1
    println(matriz[0][2]) //3
    //println(matriz[0][3]) // ERROR

}

