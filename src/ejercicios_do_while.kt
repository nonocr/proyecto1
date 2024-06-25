fun main() {
   //Problema 1
    /*
    var suma = 0

    do {
        print("ingrese un valor: (9999 para terminar)")
        val valor = readln().toInt()
        if (valor != 0 && valor != 9999){
            suma += valor
}
    }while (valor != 9999)
    println("La suma es $suma")
    if (suma > 0)
        println("La suma es mayor a cero")
    if (suma == 0)
        println("La suma es igual a cero")
    if (suma < 0)
        println("La suma es menor a cero")
     */

    //Problema 2
    var suma_saldos = 0.0
    do{
    println("Ingrese el numero de cuenta:")
    val num_cuenta = readln().toInt()
    println("Ingrese su saldo:")
    val saldo = readln().toDouble()

        if (saldo > 0)
            println("Acredor")
        if (saldo == 0.0) {
            println("Nulo")
        }
        if (saldo < 0)
            println("Deudor")

        suma_saldos += saldo


    }while (num_cuenta >= 0)
    println("La suma del saldo de las cuentas es $suma_saldos")









}

