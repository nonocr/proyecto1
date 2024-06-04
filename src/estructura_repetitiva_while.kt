fun main() {
    /*
    var x = 1
    while (x < 100){
        println(x)
        x = x + 1
}
    */


    /*
print("ingrese un valor:")
    val valor: Int = readln().toInt()

    var x = 1
    while (x <= valor ){
    println(x)
        x++
    }
*/

/*
    var x = 1
    var suma = 0

    while (x <= 10){
        println("ingrese el valor $x:")
        val valor = readln().toInt()
        suma = suma + valor
        x++
    }
    println("la suma de los 10 valores ingresados es $suma")
    val promedio = suma / 10
    println("el promedio es $promedio")
    */


    print("cuantas piezas se van a procesar?:")
    val n = readln().toInt()
    var x = 1
    var cantidad  = 0

    while (x <= n){
        println("ingrese la medida de la pieza:")
        val largo: Double = readln().toDouble()
        if(largo > 1.20 && largo < 1.30)
            cantidad = cantidad + 1
    }
    x++
    println("la cantidad de piezas aptas son: $cantidad")



}
