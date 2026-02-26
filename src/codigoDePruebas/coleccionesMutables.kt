package codigoDePruebas

fun main(){
    val mutable = mutableListOf<Int>(1, 2, 3)
    mutable.add(4)
    mutable.remove(1)
    println("Lista mutable: ${mutable}")

    val inmutable = listOf<Int>(1, 2, 3)
    //inmutable.add(1) error
    println("Lista inmutable: ${inmutable}")
}
