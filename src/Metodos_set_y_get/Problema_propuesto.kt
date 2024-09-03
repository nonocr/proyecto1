package Metodos_set_y_get

class empleado {
    var nombre: String = ""

    var sueldo: Int = 0
        set(valor) {
            if (valor >= 0)
                field = valor
            else
                field = 0
        }

    fun imprimir(){
        println( "Nombre:$nombre")
        println("Sueldo:$sueldo")

    }
    }
fun main() {
    val empleado1 = empleado()
    empleado1.nombre = "lolo"
    empleado1.sueldo = 30000
    empleado1.imprimir()
}