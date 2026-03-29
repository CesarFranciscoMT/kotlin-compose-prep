package codigoDePruebas

fun crearEstudiante(
    nombre:String,
    edad: Int = 18,
    escuela: String = "Bachilleres"
) {
        println("""
            Estudiante: ${nombre} 
            Edad: ${edad}
            Escuela: ${escuela}
        """.trimIndent())
}

fun main(){
    // Parámetro nombrado
    crearEstudiante(nombre = "Carlos", edad = 14)
    println()
    // Valores por Defecto
    crearEstudiante("Ana")
    println()
    // Valor por defecto en escuela.
    crearEstudiante("Roberta", 12)

}
