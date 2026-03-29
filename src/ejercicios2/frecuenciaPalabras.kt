package ejercicios2

/*
Ejercicio 11 - Frecuencia de palabras

Crea una función llamada frecuenciaPalabras que reciba un String
y retorne un Map<String, Int> donde cada clave es una palabra
(en minúsculas) y el valor es cuántas veces aparece en el texto.

- Se deben ignorar mayúsculas/minúsculas.
- Las palabras están separadas por espacios.

- Entrada: String
- Salida: Map<String, Int>
*/

fun frecuenciaPalabras(palabras: String): Map<String, Int> {
    val minusculas = mutableMapOf<String, Int>()
    val listaPalabras = palabras.lowercase().split(" ")
    for (palabra in listaPalabras) {
        minusculas[palabra] = minusculas.getOrDefault(palabra, 0) + 1
    }
    return minusculas
}

fun main() {
    println(frecuenciaPalabras("hola mundo hola"))           // {hola=2, mundo=1}
    println(frecuenciaPalabras("Kotlin es genial Kotlin"))   // {kotlin=2, es=1, genial=1}
    println(frecuenciaPalabras("a b a b a"))                 // {a=3, b=2}
    println(frecuenciaPalabras("solo"))                      // {solo=1}
}