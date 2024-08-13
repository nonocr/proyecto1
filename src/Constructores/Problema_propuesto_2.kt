package Constructores

class punto( var eje_x: Int, var eje_y: Int){
    constructor():this(0, 0, ) {
        print("Ingrese el eje X:")
        eje_x = readln().toInt()
        print("Ingrese el eje Y:")
        eje_y = readln().toInt()
    }

fun ubicacion(){
    if (eje_x > 0 && eje_y > 0)
        println("El punto esta en el primer cuadrante")
    else
        if (eje_x < 0 && eje_y > 0)
            println("El punto esta en el segundo cuadrante")
        else
            if (eje_x < 0 && eje_y < 0)
                println("El punto esta en el tercer cuadrante")
            else
                if (eje_x > 0 && eje_y > 0)
                    println("El punto esta en el cuarto cuadrante")
                else
                    if (this.eje_x == 0 || this.eje_y == 0)
                        println("El punto se encuentra en un eje")


}
}

fun main() {
    val punto1 = punto()
    punto1.ubicacion()
}