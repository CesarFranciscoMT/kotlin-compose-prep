package ejercicios2

/*
Ejercicio 5 - Comprimir String

Crea una función llamada comprimirString que reciba un String
y retorne una versión comprimida donde los caracteres consecutivos
repetidos se reemplazan por el carácter seguido del número de
repeticiones. Si un carácter aparece solo una vez, se deja sin número.

Si el String comprimido no es más corto que el original,
retorna el String original.

- Entrada: String
- Salida: String
*/

fun comprimirStringdos(texto: String): String {
    var contador = 1
    val listaComprimida = mutableListOf<String>()
    if (texto.length == 1) return texto
    for (i in 1..<texto.length) {
        val actual = texto[i]
        val anterior = texto[i-1]
        if (actual == anterior) {
            if ( i == texto.length - 1){
                contador++
                listaComprimida.add("$actual${contador}")
            }
            contador++
        } else {
            if (contador == 1) listaComprimida.add("$anterior") else listaComprimida.add("${anterior}${contador}9")
            contador = 1
        }
    }
    if (contador == 1) listaComprimida.add("${texto.last()}")
    else listaComprimida.add("${texto.last()}$contador")
    val resultado = listaComprimida.joinToString("")
    return resultado //if (texto.length < resultado.length) "$texto" else "$resultado"
}

fun main() {
    println(comprimirStringdos("ab"))           //ab2
    println(comprimirStringdos("aa"))            // a2
    println(comprimirStringdos("aaabbbccc"))     // a3b3c3
    println(comprimirStringdos("aabbcc"))        // aabbcc (comprimido "a2b2c2" no es más corto)
    println(comprimirStringdos("aaaaaaa"))       // a7
    println(comprimirStringdos("abcde"))         // abcde (ninguno se repite)
    println(comprimirStringdos("aabcccccaaa"))   // a2bc5a3
    println(comprimirStringdos("aabcccccaaa"))   // a2bc5a3

}