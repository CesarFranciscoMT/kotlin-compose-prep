package codigoDePruebas

fun Any.procesarValor(){
    if (this is String){
        println("El valor ${this}, es de tipo String")
    }

    if (this is Int){
        println("El valor \"${this}\", es de tipo Int")
    }
}

fun main(){
    "Palabra".procesarValor()
    1.procesarValor()

}