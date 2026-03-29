package ejercicios

fun main(){
    val listaNumeros = mutableListOf(1, 2, 3, 4, 5)
    val listaVacia = listOf<Int>()
    println(elMayor(listaNumeros))
    println(elMayor(listaVacia))

    // ------------------------------------- //


}



fun elMayor(num: List<Int>?): Int? = num?.maxOrNull()
