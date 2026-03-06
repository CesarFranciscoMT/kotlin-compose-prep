package ejercicios

/*
Ejercicio 2 - Invertir una cadena de texto

Escribe una funcion llamada invertir que reciba una cadena de texto (String)
y devuelva una nueva cadena con los caracteres en orden inverso.

No puedes usar la funcion reversed() ni reverse() de Kotlin.
Debes implementar la logica manualmente.

Entrada: una cadena de texto.
Salida: la misma cadena pero con sus caracteres en orden inverso.
*/

fun invertir(palabra: String): String {
    var nueva = ""
    for (letra in palabra) {
        nueva = letra + nueva
    }
    return nueva
}



// Datos para usar:

fun main() {
    println(invertir("hola"))    // Esperado: "aloh"
    println(invertir("Kotlin"))  // Esperado: "niltoK"
    println(invertir("a"))       // Esperado: "a"
    println(invertir(""))        // Esperado: ""
}