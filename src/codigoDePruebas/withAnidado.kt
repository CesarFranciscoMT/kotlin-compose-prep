package codigoDePruebas

data class Direccion(var calle: String = "", var ciudad: String = "")
data class Usuario(var nombre: String = "", var direccion: Direccion = Direccion())

fun main(){
    val usuario = Usuario()

    with(usuario){
        nombre = "Ana"

        with(direccion){
            calle = "Av. Principal 123"
            ciudad = "CDMX"
        }
    }
    println(usuario)
}