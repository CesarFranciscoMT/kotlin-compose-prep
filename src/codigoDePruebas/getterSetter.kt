package codigoDePruebas

class Persona3 {
    var nombre: String = "Sin nombre"  // Getter y setter automáticos
    val edad: Int = 0                  // Solo getter automático (val)
}

fun main() {
    val persona = Persona3()

    // Usar getter automático
    println(persona.nombre)  // Lee: llama al getter

    // Usar setter automático
    persona.nombre = "Ana"   // Escribe: llama al setter

    println(persona.nombre)  // Ana
}