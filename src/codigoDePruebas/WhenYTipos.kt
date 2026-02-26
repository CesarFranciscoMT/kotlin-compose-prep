package codigoDePruebas

fun describir(valor: Any) {
    when (valor) {
        is String -> println("El valor el valor es un texto con ${valor.length} carácteres")
        is Int -> println("El valor es ${valor} (entero) y multilplicado por dos es: ${valor * 2}")
        else -> println("El valor es diferente")
    }
}

fun diaSemana(valor: Any = 1): String{
    return when (valor) {
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miercoles"
        in 4..5 -> "Jueves o viernes"
        else -> "Otro día"
    }

}

fun main(){
    describir(2)
    describir("Texto")
    describir(true)

    println(diaSemana(1))
    println(diaSemana(4))
    println(diaSemana(6))

}
