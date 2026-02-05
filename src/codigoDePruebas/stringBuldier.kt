package codigoDePruebas

fun generarHTML(items: List<String>): String {
    val html = StringBuilder()

    html.append("<ul>\n")
    for (item in items) {
        html.append("  <li>")
        html.append(item)
        html.append("</li>\n")
    }
    html.append("</ul>")

    return html.toString()
}

fun main() {
    val frutas = listOf("Manzana", "Naranja", "Plátano")
    println(generarHTML(frutas))
    // <ul>
    //   <li>Manzana</li>
    //   <li>Naranja</li>
    //   <li>Plátano</li>
    // </ul>
}