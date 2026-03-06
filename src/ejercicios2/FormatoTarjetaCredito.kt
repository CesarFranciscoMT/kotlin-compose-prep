package ejercicios2

/*
Ejercicio 4 - Formato de tarjeta de crédito

Crea una función llamada formatearTarjeta que reciba un String
con un número de tarjeta de crédito (puede venir con espacios o
guiones) y lo retorne en formato limpio de 4 grupos separados
por guiones: XXXX-XXXX-XXXX-XXXX

Si después de limpiar el String no tiene exactamente 16 dígitos,
retorna "Tarjeta inválida".

- Entrada: String
- Salida: String
*/

fun main() {
    println(formatearTarjeta("1234567812345678"))      // 1234-5678-1234-5678
    println(formatearTarjeta("1234 5678 1234 5678"))   // 1234-5678-1234-5678
    println(formatearTarjeta("1234-5678-1234-5678"))   // 1234-5678-1234-5678
    println(formatearTarjeta("1234"))                  // Tarjeta inválida
    println(formatearTarjeta("abcd5678efgh5678"))      // Tarjeta inválida
}