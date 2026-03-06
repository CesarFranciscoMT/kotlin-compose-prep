package ejercicios

/*
Ejercicio 11 - Verificar si una cadena es palindromo

Escribe una funcion llamada esPalindromo que reciba una cadena de texto (String)
y devuelva true si la cadena se lee igual de izquierda a derecha que de derecha
a izquierda, o false en caso contrario.

La comparacion debe ignorar mayusculas y minusculas.
No se deben considerar espacios en la comparacion.

Entrada: una cadena de texto.
Salida: true si es palindromo, false si no lo es.
*/


fun esPalindromo(palabra: String): Boolean {
  val palabraLimpia = palabra.lowercase().replace(" ", "")
  return palabraLimpia == palabraLimpia.reversed()
}

// Datos para usar:

fun main() {
  println(esPalindromo("anilina"))           // Esperado: true
  println(esPalindromo("Oso"))               // Esperado: true
  println(esPalindromo("Anita lava la tina")) // Esperado: true
  println(esPalindromo("kotlin"))            // Esperado: false
  println(esPalindromo(""))                  // Esperado: true
  println(esPalindromo("a"))                 // Esperado: true
}