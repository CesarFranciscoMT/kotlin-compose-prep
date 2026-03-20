package ejercicios3

/*
Ejercicio 4 - Identificar scopes
Lee este código y dime el scope de cada variable:
nombre, saldoInicial, saldo, monto, nuevoSaldo
*/

class CuentaBancaria2(val nombre: String, saldoInicial: Double) {
    var saldo = saldoInicial // De clase

    fun depositar(monto: Double) {
        saldo += monto //  monto De función
        val nuevoSaldo = saldo // Local
        println("Nuevo saldo: $nuevoSaldo")
    }
}

fun main() {
    val a = 10
    val b = 3

    println(a / b)
    println(a.toDouble() / b)
    println(a % b)
}