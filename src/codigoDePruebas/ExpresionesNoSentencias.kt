package codigoDePruebas

fun main(){
    val edad = 25
    val categoria = if (edad >= 18) "Adulto" else "Todo publico"

    print("Categoría: ${categoria}")
    println()
    val dia = 3
    val diaSemana = when (dia){
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miercoles"
        else -> "Otro día"
    }

    println("Dia de la semana: ${diaSemana}")

}