fun main() {
    //Problema 1
    /*
     print("ingrese el sueldo del empleado:")
     val sueldo: Double = readln().toDouble()

     //condicional if, si su sueldo es mayor a 3000
     //imprimir "debe pagar impustos"

     if (sueldo > 3000) {
         println("debe pagar impuestos")
     }
     */

    /*
    //Problema 2
    print("ingrese primer valor:")
    val val1 = readln().toInt()
    print("ingrese el segundo valor:")
    val val2 = readln().toInt()

//condicional con if / else
    if (val1 > val2) {
        print("el mayor valor es $val1")
    } else
        print("el mayor valor es $val2")
     */

    /*
    //problema 3
    print("ingrese el primer valor")
    val val1: Int = readln().toInt()
    print("ingrese el segundo valor")
    val val2: Int = readln().toInt()

    if(val1 < val2){
        val suma: Int = val1 + val2
    val resta: Int = val1 - val2

    println("la suma de los dos valores es igual a $suma")
    println("la resta de los dos valores es igual a $resta")

}else{
        val producto: Int = val1 * val2
    val division: Int = val1 / val2
    println("el producto de los dos valores es igual a $producto")
    println("la division  de los dos valores es igual a $division")
    }


     */

    /*
    //problema 4
    print("ingrese la primera nota:")
    val nota1: Int = readln().toInt()
    print("ingrese la segunda nota:")
    val nota2: Int = readln().toInt()
    print("ingrese la tercera nota:")
    val nota3: Int = readln().toInt()

    if((nota1 + nota2 + nota3) / 3 >= 70 ){
        println("Promocionado")

    }
     */

    //problema 5
    print("ingrese un numero entre el 1 y el 99:")
    val num: Int = readln().toInt()
    if (num < 1){
        println("Numero no valido")
    }
    if (num > 99){
        println("Numero no valido")
    }


    if(num >= 10){
        println("Su numero tiene dos digitos")

}else{
        println("Su numero solo tiene un digito")
    }
}