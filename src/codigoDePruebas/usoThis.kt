package codigoDePruebas

class Persona(val nombre: String, val edad: Int) {
    fun presentarse() {
        // 'this' es opcional aquí
        println("Hola, soy ${this.nombre} y tengo ${this.edad} años")
        println("Hola, soy $nombre y tengo $edad años")  // Equivalente
    }

    fun cumplirAnios(edad: Int) {
        // 'this' necesario para distinguir parámetro de propiedad
        if (edad > this.edad) {
            println("Ya tengo $edad años")
        }
    }
}

fun main() {
    val persona = Persona("Carlos", 25)
    persona.run{
        presentarse()
        cumplirAnios(26)
    }

}