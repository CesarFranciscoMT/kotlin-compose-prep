package ejercicios3

/*
Ejercicio 4 - Describir elemento
Escribe una función que reciba un Any y devuelva
un String describiendo qué tipo es y su valor.
- Si es String: "Texto: [valor]"
- Si es Int: "Número: [valor]"
- Si es Boolean: "Booleano: [valor]"
- Cualquier otro: "Tipo desconocido"
*/

fun describir(valor: Any): String {
    return when (valor) {
        is String -> "Texto: $valor"
        is Int -> "Número: $valor"
        is Boolean -> "Booleano: $valor"
        else -> "Tipo desconocido"
    }
}

fun main() {
    println(describir("Hola"))   // Texto: Hola
    println(describir(42))       // Número: 42
    println(describir(true))     // Booleano: true
    println(describir(3.14))     // Tipo desconocido
}