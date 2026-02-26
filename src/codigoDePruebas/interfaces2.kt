package codigoDePruebas



fun main(){
    val lista = listOf(
        "Ana" to 30,
        "Beto" to 25,
        "Pedro" to 22
    )

    lista
        .filter { (_, edad) -> edad >= 25 }
        .forEach { (nombre, edad) -> println("${nombre} tiene ${edad}") }
}

