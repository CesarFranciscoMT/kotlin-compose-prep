package codigoDePruebas

class Persona4(var edad:Int){
    var nombre: String = "Ana"
        get() = field
        set(value){
            field = value
        } // Redundante, no es necesario colocar los getters y los setters

    var edadEnCincoAnios:Int = 0
        get() = edad + 5

}

fun main() {
    val persona = Persona4(5)

    println("El nombre de la persona es: ${persona.nombre}")
    println("La edad de ${persona.nombre} en cinco años es: ${persona.edadEnCincoAnios}")
}


