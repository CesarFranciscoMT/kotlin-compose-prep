package c_Ejercicios_clases_objetos

class Ejemplo(val nombre: String) {
    val propiedad1 = "Prop1".also { println("1. Propiedad") }

    init {
        println("2. Bloque init")
    }

    val pripiedad2 = "Prop2".also { println("3. Propiedad2")}

    init {
        println("4. Bloque init 2")
    }

    constructor(nombre: String, extra: String) : this(nombre) {
        println("5. Constructor secundario: $extra")
    }
}

fun main() {
    Ejemplo("Test", "Extra")
    // 1. Propiedad
    // 2. Bloque init
    // 3. Constructor secundario: Extra
}