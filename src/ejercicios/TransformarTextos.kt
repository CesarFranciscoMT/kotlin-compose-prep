package ejercicios

/*
Crea una función llamada transformarTextos que reciba dos parámetros:
1. Una lista de strings llamada textos
2. Una lambda llamada transformacion que reciba un String y devuelva un String

La función debe aplicar la transformación a cada texto de la lista y devolver la nueva lista transformada.

Después, en la función main, debes:
1. Llamar a transformarTextos con la lista dada y una lambda que convierta cada texto a mayúsculas
2. Llamar a transformarTextos con la lista dada y una lambda que agregue el prefijo "Kotlin: " a cada texto
3. Llamar a transformarTextos con la lista dada y una lambda que devuelva solo los primeros 3 caracteres de cada texto
4. Imprimir cada resultado
*/

// Datos para usar:

val textos = listOf("hola", "mundo", "compose", "jetpack", "android")

fun transformarTextos(textos: List<String>, transformacion: (String) -> String): List<String> {
    return textos.map { transformacion(it) }
}

fun main() {
    println(transformarTextos(textos) { it.uppercase() })
    println(transformarTextos(textos) { "Kotlin: $it" })
    println(transformarTextos(textos) { it.substring(0..2) })
}