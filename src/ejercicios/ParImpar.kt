package ejercicios

/*
Ejercicio 1 - Verificar si un numero es par

Escribe una funcion llamada esPar que reciba un numero entero (Int)
y devuelva un valor booleano (Boolean).

- Si el numero es par, debe devolver true.
- Si el numero es impar, debe devolver false.

Entrada: un numero entero.
Salida: true si es par, false si es impar.

Ejemplos:
  esPar(4)  -> true
  esPar(7)  -> false
  esPar(0)  -> true
  esPar(-2) -> true
*/

fun esPar(numero: Int): Boolean = numero % 2 == 0

fun main () {
    println(esPar(4))
    println(esPar(7))
    println(esPar(0))
    println(esPar(-2))
}