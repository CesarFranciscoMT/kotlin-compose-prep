package codigoDePruebas

fun main() {
    val texto = "Hola,,Mundo,,Kotlin"  // comas dobles

    // Split normal (mantiene vacíos)
    val conVacios = texto.split(",")
    println(conVacios)  // [Hola, , Mundo, , Kotlin]
    for (palabra in conVacios){
        print("$palabra - ")
    }

    // Filtrar strings vacíos
    val sinVacios = texto.split(",").filter { it.isNotEmpty() }
    println(sinVacios)  // [Hola, Mundo, Kotlin]
    for (palabra in sinVacios){
        print("$palabra - ")
    }

    // O usar filterNot con isBlank para ignorar espacios también
    val limpio = texto.split(",").filterNot { it.isBlank() }
    println(limpio)  // [Hola, Mundo, Kotlin]
}