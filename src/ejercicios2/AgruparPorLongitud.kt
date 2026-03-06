package ejercicios2

/*
Ejercicio 12 - Agrupar palabras por su longitud

Escribe una funcion llamada agruparPorLongitud que reciba una lista de cadenas
de texto (List<String>) y devuelva un mapa (Map<Int, List<String>>) donde cada
clave sea una longitud y su valor sea la lista de palabras que tienen esa longitud.

Las palabras dentro de cada grupo deben mantener el orden en que aparecieron
en la lista original.

No puedes usar la funcion groupBy() de Kotlin.
Debes implementar la logica manualmente.

Entrada: una lista de cadenas de texto.
Salida: un mapa donde la clave es la longitud y el valor es la lista de palabras
con esa longitud.
*/

fun agruparPorLongitud(lista: List<String>): Map<Int, List<String> > {
    val mapa = mutableMapOf<Int, MutableList<String>>()
    for (palabra in lista){
        if (mapa.containsKey(palabra.length)) mapa[palabra.length]?.add(palabra) else mapa[palabra.length] = mutableListOf(palabra)
    }
    return mapa
}

// Datos para usar:

fun main() {
    println(agruparPorLongitud(listOf("sol", "lua", "estrella", "mar", "cielo")))
    // Esperado: {3=[sol, lua, mar], 8=[estrella], 5=[cielo]}

    println(agruparPorLongitud(listOf("a", "bb", "c", "dd", "eee")))
    // Esperado: {1=[a, c], 2=[bb, dd], 3=[eee]}

    println(agruparPorLongitud(listOf<String>()))
    // Esperado: {}
}