package ejercicios

/*
Crea una función llamada aplicarOperacion que reciba dos parámetros:
1. Un número entero llamado número
2. Una lambda llamada operacion que reciba un Int y devuelva un Int

La función debe aplicar la lambda al número y devolver el resultado.

Después, en la función main, debes:
1. Llamar a aplicarOperacion con el número 10 y una lambda que lo multiplique por 2
2. Llamar a aplicarOperacion con el número 15 y una lambda que le sume 5
3. Llamar a aplicarOperacion con el número 20 y una lambda que lo divida entre 4
4. Imprimir cada resultado en consola
*/

// Datos para usar:

val numero1 = 10
val numero2 = 15
val numero3 = 20


fun aplicarOperacion(numero: Int, operacion:(Int) -> Int): Int{
    return operacion(numero)
}

fun main(){
    println(aplicarOperacion(numero1){ it * 2})
    println(aplicarOperacion(numero2){ it + 5})
    println(aplicarOperacion(numero3){ it / 4})

}