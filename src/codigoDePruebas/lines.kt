package codigoDePruebas


fun saludar(
    nombre: String,
    formatear: (String) -> String = { it.uppercase() }
): String {
    return "Hola, ${formatear(nombre)}"
}

fun main() {
    // Usando el valor por defecto
    println(saludar("Ana"))  // Hola, ANA

    // Proporcionando función personalizada
    println(saludar("Ana") { palabra -> palabra.replaceFirstChar { it.uppercase() } })  // Hola, ana
}