package ejercicios2

/*
Ejercicio 8 - Anagramas

Crea una función llamada sonAnagramas que reciba dos Strings
y determine si son anagramas entre sí.

Dos palabras son anagramas si contienen exactamente las mismas
letras con la misma cantidad, pero en diferente orden.

- Se deben ignorar espacios.
- Se deben ignorar mayúsculas/minúsculas.

- Entrada: String, String
- Salida: Boolean
*/

fun sonAnagramas(palabraUno: String, palabraDos: String): Boolean {
    val listaLetrasUno = palabraUno.replace(" ", "").lowercase().toList().sorted()
    val listaLetrasDos = palabraDos.replace(" ", "").lowercase().toList().sorted()
    return listaLetrasUno == listaLetrasDos
}

fun main() {
    println(sonAnagramas("listen", "silent"))         // true
    println(sonAnagramas("Hola", "halo"))             // true
    println(sonAnagramas("Amor", "Roma"))             // true
    println(sonAnagramas("kotlin", "java"))           // false
    println(sonAnagramas("New York Times", "monkeys write"))  // true
}