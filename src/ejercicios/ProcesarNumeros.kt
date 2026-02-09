package ejercicios

import kotlin.math.absoluteValue

/*
Crea una función llamada procesarNumeros que reciba tres parámetros:
1. Una lista de números enteros llamada numeros
2. Una lambda llamada filtro que reciba un Int y devuelva un Boolean
3. Una lambda llamada transformacion que reciba un Int y devuelva un Int

La función debe:
1. Filtrar la lista usando el filtro
2. Transformar cada número filtrado usando la transformación
3. Sumar todos los números resultantes
4. Devolver la suma total

En main, llama a procesarNumeros con:
1. Filtrar números mayores a 5 y multiplicarlos por 3
2. Filtrar números pares y elevarlos al cuadrado
3. Filtrar números negativos y convertirlos a positivos (valor absoluto)
4. Imprimir cada resultado
*/

// Datos para usar:

val numeros5 = listOf(2, 8, -3, 15, 4, -7, 12, 6, -1, 9)

fun procesarNumeros(numeros: List<Int>, filtro: (Int) -> Boolean, transformacion: (Int) -> Int) =
    numeros.filter { filtro(it) }.map { transformacion(it) }.sum()


fun main() {
    println(
        "La suma de los números mayores a 5 y multiplicarlos por 3 es: ${
            procesarNumeros(
                numeros5,
                filtro = { it > 5 },
                transformacion = { numero -> numero * 3 })
        } ")
    println(
        "La suma de los números pares y elevados al cuadrado: ${
            procesarNumeros(
                numeros5,
                filtro = { it % 2 == 0 },
                transformacion = { numero -> numero * numero })
        } ")
    println(
        "La suma de los números negativos y convertidos a positivos: ${
            procesarNumeros(
                numeros5,
                filtro = { it < 0 },
                transformacion = { numero -> numero.absoluteValue })
        } ")
}