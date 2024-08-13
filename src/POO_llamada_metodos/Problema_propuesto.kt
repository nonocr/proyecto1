package POO_llamada_metodos

class hijos(var edad: Int){
  fun cargar(){
      for (i in 0..4)
      print("Ingrese la primer edad:")
      edad = readln().toInt()
    }
    fun MayorEdad(){
        var mayor = edad
        if (edad > mayor)
            mayor = edad
        println("La mayor edad es: $mayor")
        }
    }

fun main() {
    val hijos1 = hijos(2)
}

