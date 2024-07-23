package Funciones_con_expresion_unica
fun convertircastelano(valor: Int)= when (valor){
    1->"uno"
    2->"dos"
    3->"tres"
    4->"cuatro"
    5->"cinco"
    else->"error"
}
fun main() {
    for (i in 1..6)
        println(convertircastelano(i))
}