package ejercicios2

import jdk.internal.org.jline.utils.InfoCmp

/*
Ejercicio 7 - Cifrado César

Crea una función llamada cifrarCesar que reciba un String y un
número entero (desplazamiento), y retorne el texto cifrado
desplazando cada letra del alfabeto esa cantidad de posiciones.

- Solo se desplazan letras (a-z, A-Z), los demás caracteres
  quedan igual.
- Se debe respetar mayúsculas y minúsculas.
- Si el desplazamiento pasa de la 'z', vuelve a empezar desde 'a'.
  Ejemplo: con desplazamiento 3, 'x' → 'a', 'y' → 'b', 'z' → 'c'

- Entrada: String, Int
- Salida: String
*/

fun desplazar(letra:Char, suma: Int): Char{
    if (!letra.isLetter()) return letra
    if (letra.isUpperCase()) {
        val inicio = 'A'.code
        val fin = 'Z'.code
        val rango = fin - inicio + 1
        val numero = letra.code
        return (inicio + ((numero - inicio + suma) % rango)).toChar()

    } else {
        val inicio = 'a'.code
        val fin = 'z'.code
        val rango = fin - inicio + 1
        val numero = letra.code
        return (inicio + ((numero - inicio + suma) % rango)).toChar()
    }

}

fun cifrarCesar(texto: String, desplazamiento: Int): String {
    return texto.map { letra -> desplazar(letra, desplazamiento) }.joinToString("")
}

// A-Z = 65 - 90
// a-z = 97 - 122

fun main() {
    println(cifrarCesar("abc", 3))           // def
    println(cifrarCesar("xyz", 3))           // abc
    println(cifrarCesar("Hola Mundo!", 5))   // Mtqf Rzsit!
    println(cifrarCesar("ABC", 1))           // BCD
}