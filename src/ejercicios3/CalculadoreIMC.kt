package ejercicios3

/*
Ejercicio 4 - Calculadora de IMC
Escribe una función que calcule el IMC dado peso y altura.
- Fórmula: peso / (altura * altura)
- Recibe: peso Double, altura Double
- Devuelve: String con el resultado formateado a 2 decimales
- Usa "%.2f".format(valor) para formatear
*/

fun calcularIMC(peso: Double, altura: Double) = "IMC: ${"%.2f".format( peso / (altura * altura))}"


fun main() {
    println(calcularIMC(70.0, 1.75))  // IMC: 22.86
    println(calcularIMC(90.0, 1.70))  // IMC: 31.14
}