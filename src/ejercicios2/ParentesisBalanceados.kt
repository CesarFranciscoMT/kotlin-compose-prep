package ejercicios2

/*
Ejercicio 9 - Paréntesis balanceados

Crea una función llamada parentesisBalanceados que reciba un String
y verifique si los paréntesis están correctamente balanceados.

Balanceado significa que:
- Cada paréntesis de apertura '(' tiene su cierre ')'.
- Se cierran en el orden correcto.
- No hay paréntesis de cierre sin su apertura correspondiente.

- Entrada: String
- Salida: Boolean
*/

fun parentesisBalanceados(texto: String) :Boolean {
    var balance = 0
    for (letra in texto) {
        if (letra == '(') balance++
        if (letra == ')') balance--
        if (balance < 0 ) return false
    }
    return balance == 0
}

fun main() {
    println(parentesisBalanceados("(hola)"))           // true
    println(parentesisBalanceados("((a)(b))"))         // true
    println(parentesisBalanceados("(a + b) * (c)"))    // true
    println(parentesisBalanceados("((abc)"))            // false
    println(parentesisBalanceados(")("))                // false
    println(parentesisBalanceados("hola mundo"))        // true (sin paréntesis es válido)
}