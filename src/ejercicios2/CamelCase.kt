package ejercicios2

/*
Ejercicio 10 - Convertir a camelCase

Crea una función llamada aCamelCase que reciba un String con
palabras separadas por espacios, guiones o guiones bajos, y lo
convierta a formato camelCase.

En camelCase:
- La primera palabra va toda en minúsculas.
- Las siguientes palabras empiezan con mayúscula y el resto en minúsculas.
- No hay separadores.

- Entrada: String
- Salida: String
*/

//fun aCamelCase(entrada: String): String {
//    val entradaLimpia = entrada
//        .replace("-"," ")
//        .replace("_", " ")
//        .split(" ")
//        .toList()
//    var resultado = mutableListOf<String>()
//    resultado.add(entradaLimpia[0].lowercase())
//    for (i in 1..<entradaLimpia.size) {
//        val titulo = entradaLimpia[i].lowercase().replaceFirstChar {it.uppercase()}
//        resultado.add(titulo)
//    }
//    return resultado.joinToString("")
//}


fun aCamelCase(entrada: String): String {
    val entradaLimpia = entrada.split(" ", "-", "_")
    val resultado = entradaLimpia.mapIndexed { indice, palabra ->
        if (indice == 0) {
            palabra.lowercase()
        } else {
            palabra
                .lowercase()
                .replaceFirstChar {
                    it.uppercase()
                }
        }
    }
    return resultado.joinToString("")
}

fun main() {
    println(aCamelCase("hola mundo"))              // holaMundo
    println(aCamelCase("mi-variable-nueva"))        // miVariableNueva
    println(aCamelCase("crear_nueva_cuenta"))        // crearNuevaCuenta
    println(aCamelCase("YA ESTOY EN MAYUSCULAS"))   // yaEstoyEnMayusculas
    println(aCamelCase("solo"))                      // solo
}