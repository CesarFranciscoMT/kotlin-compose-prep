package codigoDePruebas

fun String.esPalindromo(): Boolean{
    val palabraLimpia = this.replace(" ", "")
    return palabraLimpia.reversed() == palabraLimpia
}


fun main(){
    println("hola".esPalindromo())

    println("ana".esPalindromo())
}
