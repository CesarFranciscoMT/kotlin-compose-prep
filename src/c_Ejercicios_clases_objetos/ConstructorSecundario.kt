package c_Ejercicios_clases_objetos

class Temperatura(val celsius: Double) {

    constructor(fahrenheit: Double, esFahrenheit: Boolean)
            : this(if (esFahrenheit) (fahrenheit - 32) * 5/9 else fahrenheit) {
        if (esFahrenheit) {
            println("Convertido: ${fahrenheit}°F = $celsius°C")
        }
    }
}

fun main() {
    val temp = Temperatura(77.0)
    println("Temperatura: ${temp.celsius}")

    val temp2 = Temperatura(77.0, esFahrenheit = true)
    println("Temperatura 2 : ${temp2.celsius}")
    // Convertido: 77.0°F = 25.0°C
}