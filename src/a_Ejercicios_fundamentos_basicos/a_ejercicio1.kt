package a_Ejercicios_fundamentos_basicos


/**
 * Crea una función que valide un email
 * Reglas:
 * - No puede ser null
 * - Debe contener exactamente un @
 * - Debe tener al menos un punto después del @
 * - Retorna true si es válido, false si no
 */

fun validarEmail(email: String?): Boolean {
    if (email == null) return false
    if ("@" !in email) return false
    if (email.indexOf("@") != email.lastIndexOf("@")) return false
    val despuesArroba = email.substring(email.indexOf("@"), email.lastIndex)
    return despuesArroba.contains(".")
}

fun main() {
    println(validarEmail("user@ejem@plo.com"))
    println(validarEmail("user@ejemplo.com"))      // true
    println(validarEmail("invalido.com"))          // false
    println(validarEmail(null))                    // false
    println(validarEmail("user@ejemplo"))          // false
    println(validarEmail("user@ejemplocom"))
}