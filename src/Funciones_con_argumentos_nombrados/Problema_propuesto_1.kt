package Funciones_con_argumentos_nombrados
fun tablaMulti(num: Int, termino: Int = 10, ) {
    val result1 = num * 1
    val result2 = num * 2
    val result3 = num * 3
    val result4 = num * 4
    val result5 = num * 5
    val result6 = num * 6
    val result7 = num * 7
    val result8 = num * 8
    val result9 = num * 9
    val result10 = num * 10
    print("La tabla de multiplicar de $num es: $num * 1 = $result1 " +
            " $num * 2 = $result2" +
            " $num * 3 = $result3" +
            " $num * 4 = $result4" +
            " $num * 5 = $result5" +
            " $num * 6 = $result6" +
            " $num * 7 = $result7" +
            " $num * 8 = $result8" +
            " $num * 9 = $result9" +
            " $num * 10 = $result10")
}
fun main() {
tablaMulti(num = 2)
}