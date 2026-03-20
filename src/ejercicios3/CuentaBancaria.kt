package ejercicios3

/*
Ejercicio 4 - Cuenta bancaria
Dado este data class, di qué propiedades son
solo lectura, cuáles inmutables y cuáles mutables.
Luego escribe en main() una operación válida
y una que falle para cada propiedad.
*/

data class CuentaBancaria(
    val titular: String, // Solo lectura (referencia no camiba)
    var saldo: Double // Puede reasignarse (mutable)
) {
    val transacciones = mutableListOf<String>() // Referencia no cambia (solo lectura), pero contenido si puede (mutable).
}

fun main(){
    val cuenta = CuentaBancaria("Frank", 100000000.0)
    //cuenta.titular = "Otra persona" // Solo lectura (no se puede reasignar)
    println(cuenta.titular)

    cuenta.saldo = 300000000.0 // Puede reasignarse
    //cuenta.saldo = listOf<Double>() // Tendría que asignarse del mismo tipo

    //cuenta.transacciones = listOf<Int>() // no puede reasignarse
    cuenta.transacciones.add("Retiro") // pero puede modificarse el contenido
}
