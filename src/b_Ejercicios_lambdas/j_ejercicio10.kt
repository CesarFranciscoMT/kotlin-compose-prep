package b_Ejercicios_lambdas

fun crearCalculadora(operacion: String): (Int, Int) -> Int{
    return when(operacion){
        "suma" -> {a, b -> a + b}
        "resta" -> {a, b -> a - b}
        "multiplicacion" -> {a, b -> a * b}
        "division" -> {a, b -> if (b != 0) a/b else 0 }
        else -> {_, _ -> 0}
    }
}

fun main(){
    val sumar = crearCalculadora("suma")
    println(sumar(3, 4))
}