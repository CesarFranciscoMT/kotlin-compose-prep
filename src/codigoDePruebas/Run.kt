package codigoDePruebas

fun main(){
    //calculosComplejos()
    //funRun()
    //procesar()
    validacion()
}

fun validacion(){
    data class FormularioRegistro(
        val nombre: String,
        val email: String,
        val edad: Int
    )

    fun validarYProcesar(formulario: FormularioRegistro): String {
        return formulario.run {
            // Validaciones
            require(nombre.isNotBlank()) { "Nombre requerido" }
            require(email.contains("@")) { "Email inválido" }
            require(edad >= 18) { "Debe ser mayor de edad" }

            // Transformar y retornar
            """
            Registro exitoso:
            - Nombre: ${nombre.uppercase()}
            - Email: $email
            - Edad: $edad años
        """.trimIndent()
        }
    }

        val formulario = FormularioRegistro("Ana", "ana@example.com", 12)

        try {
            val resultado = validarYProcesar(formulario)
            println(resultado)
            // Registro exitoso:
            // - Nombre: ANA
            // - Email: ana@example.com
            // - Edad: 25 años
        } catch (e: IllegalArgumentException) {
            println("Error: ${e.message}")
        }
}

fun procesar() {


    fun procesarTexto(texto: String): Map<String, Any> {
        return texto.run {
            mapOf<String, Any>(
                "Longitud" to length,
                "palabras" to split("\\s+".toRegex()).size,
                "Lineas" to lines().size,
                "Mayusculas" to uppercase()
            )
        }
    }


    val texto = """
        Hola Mundo
        Kotlin es genial
    """.trimIndent()

    println(procesarTexto(texto))

}

// Función run
fun funRun(){
    data class Usuario(var nombre: String, var edad: Int)
    val usuario = Usuario("Ana", 25)
    val descripcion = usuario.run {
        "Usuario: ${this.nombre}, $edad años"
    }
    println(descripcion)

}

// Operaciones complejas
data class Rectangulo(val ancho: Double, val alto: Double)
fun calculosComplejos(){
    val rectangulo = Rectangulo(5.0, 10.0)

    val resultado = rectangulo.run {
        val area = ancho * alto
        val perimetro = 2 * (ancho + alto)
        "Área: $area Perimetro: $perimetro"
    }

    println(resultado)

}


