package codigoDePruebas

fun String.esMail() = this.contains("@")

fun main(){
    val mail = "frank@hotmail.com"
    println("El correo es valido: ${mail.esMail()}")

    val mail2 = "frank#hotmail.com"
    println("El correo es valido: ${mail2.esMail()}")
}