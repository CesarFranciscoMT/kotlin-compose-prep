package a_Ejercicios_fundamentos_basicos

/**
 * Crea una función que formatee un nombre completo
 * Reglas:
 * - Si es null, retorna "Anónimo"
 * - Elimina espacios extras al inicio/final
 * - Primera letra de cada palabra en mayúscula
 * - Resto en minúsculas
 */

fun formatearNombre(nombre: String?): String {
    if (nombre == null) return "Anónimo"
    var nombreLimpio = nombre.trim().lowercase()
    if (nombreLimpio == "") return "Anónimo"
    val palabras = nombreLimpio.split(" ")
    val listaPalabrasCapitalizadas = mutableListOf<String>()
    for (palabra in palabras) {
        if (palabra != "") listaPalabrasCapitalizadas.add(palabra.replaceFirstChar { it.uppercase() })
    }
    nombreLimpio = listaPalabrasCapitalizadas.joinToString(" ")

    return nombreLimpio

}

fun main() {
    println(formatearNombre("  JUAN  carlos PÉREZ  "))  // Juan Carlos Pérez
    println(formatearNombre("ana maría"))               // Ana María
    println(formatearNombre(null))                      // Anónimo
    println(formatearNombre("   "))                     // Anónimo
}