package Conceptos_POO

class alumno{
    var nombre: String = ""
    var nota: Int = 0

fun inicializar(){
    println("Ingrese el nombre del estudiante:")
    nombre = readln().toString()
    println("Ingrese la nota del estudiante:")
    nota = readln().toInt()
     }
    fun imprimir(){
        println(" Nombre:$nombre")
        println("Nota:$nota")
        if(nota == 4)
            println("Nota regular")
        else
            if(nota > 5)
                println("Nota alta")
        else
            if(nota < 4)
                println("Nota baja")
    }
}

fun main() {
    val alumno1 = alumno()
    alumno1.inicializar()
    alumno1.imprimir()
}