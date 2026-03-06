package codigoDePruebas

// Una clase con una única instancia.
object Configuracion {
    var idioma = "es"
    fun guardar() = println("Guardando")
}

fun main(){
    //Configuracion.idioma = "eng"

    println(Configuracion.idioma)
    Configuracion.guardar()
}
