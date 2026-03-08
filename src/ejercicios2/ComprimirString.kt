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

fun comprimirString(texto: String) : String {
    var contador = 1
    val lista = mutableListOf<String>()
    for (i in 0..<texto.length - 1) {
        val t1 = texto[i]
        val t2 = texto[i+1]
        if (texto[i] != texto[i + 1]){
            if (contador != 1) {
                lista.add("${texto[i]}$contador")
                contador = 1
            } else {
                lista.add("${texto[i]}")
                contador = 1
            }
            if (i == texto.length-1) lista.add("${texto[i]}")
        } else {
            if (i == texto.length-2) {
                contador++
                lista.add("${texto[i]}$contador")
            } else {
                contador++
            }
        }
    }

    val resultado = lista.joinToString("")
    return if (texto.length == resultado.length) texto else resultado

}

fun main() {
//    println(comprimirString("aa"))
//    println(comprimirString("aaabbbccc"))     // a3b3c3
//    println(comprimirString("aabbcc"))        // aabbcc (comprimido "a2b2c2" no es más corto)
//    println(comprimirString("aaaaaaa"))       // a7
//    println(comprimirString("abcde"))         // abcde (ninguno se repite)
//    println(comprimirString("aabcccccaaa"))   // a2bc5a3
}