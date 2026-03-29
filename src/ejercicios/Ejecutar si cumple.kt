package ejercicios

/*
Crea una función llamada ejecutarSiCumple que reciba tres parámetros:
1. Un número entero llamado valor
2. Una lambda llamada condicion que reciba un Int y devuelva un Boolean
3. Una lambda llamada accion que reciba un Int y no devuelva nada (Unit)

La función debe verificar si el valor cumple la condición, y solo si la cumple, ejecutar la acción.

En main, debes:
1. Crear una lista de números del 1 al 10
2. Para cada número, usar ejecutarSiCumple con condición "es par" y acción "imprimir el número multiplicado por 2"
3. Para cada número, usar ejecutarSiCumple con condición "es mayor a 5" y acción "imprimir el número al cuadrado"
*/

// Datos para usar:

val numeros6 = (1..10).toList()

fun ejecutarSiCumple(valor: Int, condicion: (Int) -> Boolean, accion: (Int) -> Unit): Unit {
    if (condicion(valor)) {
        accion(valor)
    }
}

fun main() {
    for (numero in numeros6) {
        ejecutarSiCumple(numero, { it % 2 == 0 }, { println("Números pares por dos ${it * 2}") })
    }

    numeros6.forEach {
        ejecutarSiCumple(
            it,
            { it > 5 },
            { println("Números matores que cinco al cuadrado ${it * it}") })
    }
}