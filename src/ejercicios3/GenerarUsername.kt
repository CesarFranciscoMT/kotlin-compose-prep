package ejercicios3

/*
Ejercicio 4 - Generar username
Escribe una función que reciba nombre y apellido
y genere un username en formato "nombre.apellido"
todo en minúsculas y sin espacios extra.
- Recibe: String, String
- Devuelve: String
*/

fun generarUsername(nombre: String, apellido: String) = "${nombre.trim().lowercase()}.${apellido.trim().lowercase()}"


fun main() {
    println(generarUsername("  ANA  ", "  LÓPEZ  "))  // ana.lópez
    println(generarUsername("Carlos", "García"))       // carlos.garcía

    println("hola".equals("Hola"))
}