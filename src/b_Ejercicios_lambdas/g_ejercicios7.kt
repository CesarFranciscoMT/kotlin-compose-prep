package b_Ejercicios_lambdas

fun fibonacci(n: Int): Long {
    if (n <= 0) {
        return 0L
    } else if (n == 1) {
        return 1L
    }

    var a: Long = 0L
    var b: Long = 1L

    for (i in 2..n) {
        val nextTerm = a + b
        a = b
        b = nextTerm
    }

    return b
}

fun main() {
    val position = 10 // Puedes cambiar este valor para calcular otro término de la secuencia
    println("El ${position}-ésimo término de la secuencia de Fibonacci es: ${fibonacci(position)}")
}