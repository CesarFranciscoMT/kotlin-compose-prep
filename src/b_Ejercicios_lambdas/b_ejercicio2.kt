package b_Ejercicios_lambdas

/**
 * EJERCICIO 2: Transformación con Lambda
 *
 * Crea una función que reciba una lista de strings
 * y una lambda que transforme cada string.
 * Retorna la lista transformada.
 *
 * Ejemplo: ["hola", "mundo"] con lambda { it.uppercase() } → ["HOLA", "MUNDO"]
 */

fun transformarLista(textos: List<String>, transformar: (String) -> String): List<String> {
    return textos.map {transformar(it)}
}

fun main() {
    val palabras = listOf("kotlin", "compose", "android")

    // Convertir a mayúsculas
    println(transformarLista(palabras) { it.uppercase() })
    // [KOTLIN, COMPOSE, ANDROID]

    // Agregar longitud al final
    println(transformarLista(palabras) { "$it (${it.length})" })
    // [kotlin (6), compose (7), android (7)]

    // Primera letra mayúscula
    println(transformarLista(palabras) { it.replaceFirstChar { c -> c.uppercase() } })
    // [Kotlin, Compose, Android]
}