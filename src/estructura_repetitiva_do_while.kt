fun main() {
    //problema 1
    /*
    do{
        print("ingrese un valor entre 1 y 999")
        val valor = readln().toInt()
        if(valor < 10 )
            println("el numero tiene un digito")
        else
            if (valor < 100)
                println("el valor ingresado tiene dos digitos")
        else
            println("el valor tiene tres digitos")
    }while (valor != 0)
     */


    //problema 2
/*
    var cant = 0
    var suma = 0
    do {
        println("ingrese un valor (0 para finalizar):")
        val valor = readln().toInt()
        if (valor != 0){
            suma += valor
            cant++
        }
    }while (valor != 0)
    if (cant != 0){
        val prom = suma / cant
        println("el promedio de los valores ingresados es: $prom")
    }
 */

    //problema 3

    var cant_inferior = 0 //por debajo de 9.8
    var cant_superior = 0 //por debajo de 10.2
    var cant_adecuada = 0 //entre 9.8 y 10.2

    do {
        print("ingrese el peso de la pieza (0 para finalizar)")
        val peso = readln().toDouble()
        if (peso > 10.2)
            cant_superior++
        else
            if (peso >= 9.8 && peso <= 10.2)
                cant_adecuada++
        else
            cant_inferior++
    }while (peso != 0.0)
    println("piezas aptas: $cant_adecuada")
    println("piezas peso superior a 10.2: $cant_superior")
    println("piezas peso inferior a 9.8: $cant_inferior")
    val suma = cant_adecuada + cant_inferior + cant_superior
    println("cantidad total de piezas procesadas: $suma")
}