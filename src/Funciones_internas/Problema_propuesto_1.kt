package Funciones_internas
 fun mayor(){
    fun mayor(valor1: Int, valor2: Int): Int {
        var mayor = 0
        for (i in 1..5) {
            println("Ingrese un valor: ")
            val valor1 = readln().toInt()
            println("Ingrese otro valor: ")
            val valor2 = readln().toInt()
            if (valor1 > valor2)
                mayor + valor1
            if (valor2 > valor1)
                mayor + valor2
        }
        println("El numero mayor es $mayor")
    }
}

fun main() {

}
