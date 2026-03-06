package codigoDePruebas

fun main(){
    println("Como te llamas? ")
    var nombre = readln()
    if (nombre == "") nombre = "Desconocido"
    println("Hola $nombre")
}
