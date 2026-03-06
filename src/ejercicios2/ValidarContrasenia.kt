package ejercicios2

/*
Ejercicio 3 - Validar contraseña

Crea una función llamada esPasswordValida que reciba un String
y valide que cumple TODAS estas condiciones:
- Tiene al menos 8 caracteres
- Contiene al menos una letra mayúscula
- Contiene al menos un dígito
- Contiene al menos un carácter especial (que no sea letra ni dígito)

- Entrada: String
- Salida: Boolean
*/


//fun esPasswordValida(password: String): Boolean {
//    return when {
//        password.length < 8 -> false
//        password.count { it.isUpperCase() } < 1 -> false
//        password.count { it.isDigit() } < 1 -> false
//        password.count { !it.isLetterOrDigit() } < 1 -> false
//        else -> true
//    }
//}

fun esPasswordValida(password: String): Boolean {
    return when {
        password.length < 8 -> false
        password.none { it.isUpperCase() } -> false
        password.none { it.isDigit() } -> false
        password.none { !it.isLetterOrDigit() } -> false
        else -> true
    }
}



fun main() {
    println(esPasswordValida("Kotlin2025!"))   // true
    println(esPasswordValida("kotlin2025"))    // false (sin mayúscula ni especial)
    println(esPasswordValida("KOTLIN!"))       // false (sin dígito y menos de 8)
    println(esPasswordValida("Ab1!"))          // false (menos de 8)
    println(esPasswordValida("Abcdefg1!"))     // true
}

