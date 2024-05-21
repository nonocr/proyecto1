fun main() {
    /*
    print("ingrese primer valor:")        //readln captura la entrada del teclado
    val valor1 = readln().toInt()        //.toInt convierte los datos a tipo numerico


    print("ingrese segundo valor:")
    val valor2 = readln().toInt()

    val suma = valor1 + valor2
    val resta = valor1 - valor2
    val producto = valor1 * valor2
    val division = valor1 / valor2

    println("la suma de $valor1 + $valor2 es igual a $suma")
    println("la resta de $valor1 - $valor2 es igual a $resta")
    println("el producto de $valor1 * $valor2 es igual a $producto")
    println("la divison de $valor1 / $valor2 es igual a $division")
    */

    /*
    print("ingrese el valor del lado del cuadrado:")
    val l_cuadrado = readln().toInt()
    val sup_cuadrado: Int
    val peri_cuadrado: Int

    sup_cuadrado = l_cuadrado * l_cuadrado
    peri_cuadrado = l_cuadrado * 4

    println("La superficie del cuadrado es igual a $sup_cuadrado")
    println("El perimetro del cuadrado es igual a $peri_cuadrado")
    */

    /*
    println("ingrese el precio del producto:")
    val precio = readln().toInt()

    println("ingrese la cantidad que desea comprar:")
    val cantidad = readln().toInt()

    val pago = cantidad * precio

    println("Usted debe pagar $pago colones")
    */

    /*
    println("ingrese el primer numero:")
    val num1 = readln().toInt()
    println("ingrese el segundo numero:")
    val num2 = readln().toInt()
    println("ingrese el tercer numero:")
    val num3 = readln().toInt()
    println("ingrese el cuarto numero:")
    val num4 = readln().toInt()

    val suma = num1 + num2
    val produ = num3 * num4

    println("la suma de los dos primeros numeros es igual a $suma")
    println("el producto del tercer y cuarto numero es igual a $produ")
    */


    println("ingrese el primer numero:")
    val num1 = readln().toInt()
    println("ingrese el segundo numero:")
    val num2 = readln().toInt()
    println("ingrese el tercer numero:")
    val num3 = readln().toInt()
    println("ingrese el cuarto numero:")
    val num4 = readln().toInt()

    val suma = num1 + num2 + num3 + num4
    val prom = (num1 + num2 + num3 + num4)/4

    println("La suma de los 4 numeros ingresados es igual a $suma")
    print("el promedio de los numeros ingresados es igual a $prom")
}