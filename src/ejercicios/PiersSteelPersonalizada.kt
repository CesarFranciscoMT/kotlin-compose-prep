package ejercicios

import kotlin.math.round

data class Meta(
    val nombre: String,
    val demora: Double,
    val expectativa: Double,
    val razones: MutableList<Razon> = mutableListOf()
) {
    val impulsividad: Double = 7.0
    val puntuacionDeDescanso: Double = 6.9

    fun calcularMotivacion(): Double {
        val valor: Double = razones.sumOf { it.peso }
        val motivacion = (expectativa * valor) / (impulsividad * demora * puntuacionDeDescanso)
        return round(motivacion * 10) / 10
    }
}

fun imprimirMetasOrdenadas(metas: List<Meta>) {
    metas.sortedByDescending { it.calcularMotivacion() }
        .forEach { meta ->
            println("La meta \"${meta.nombre}\" tiene una puntuación de motivación de ${meta.calcularMotivacion()}")
        }
}

data class Razon(
    val descripcion: String,
    val peso: Double
)

fun main() {

    val hacerEjercicio = Meta(
        "Hacer ejercicio diario aunque sea 5 minutos",
        demora = 2.0,
        expectativa = 5.5,
        razones = mutableListOf(
            Razon("Necesito estar en forma antes de concebir a mi bebé", 10.0),
            Razon("Quiero tener más energía para programar y estudiar", 8.0),
            Razon("Quiero sentirme bien con mi cuerpo, dejé de verme fuerte", 8.0),
            Razon("Quiero desarrollar disciplina sin autocastigo", 7.0),
            Razon("Quiero reducir el estrés y la ansiedad crónica", 9.0)
        )
    )

    val aprenderKotlin = Meta(
        "Dominar Kotlin",
        demora = 8.0,
        expectativa = 9.0,
        razones = mutableListOf(
            Razon("Es mi sueño desde que empecé la carrera, me especialicé en móvil", 10.0),
            Razon("Ganaría el doble como dev móvil y podría trabajar remoto", 10.0),
            Razon("Ya llevo el 75% de Kotlin aprendido", 8.0),
            Razon("Cuando lo practico me gusta mucho más que el backend", 9.0),
            Razon("Quiero salir de ser becario y aportar más dinero en casa", 9.0),
            Razon("Me gusta mucho aprender kotlin", 8.0),
            Razon("Cada que aprendo un tema nuevo me siento bien", 6.0)

        )
    )

    val aprenderDjangoYPython = Meta(
        "Aprender Django y Python para el trabajo actual",
        demora = 4.0,
        expectativa = 7.0,
        razones = mutableListOf(
            Razon("Es el stack al que me movieron en el trabajo", 9.0),
            Razon("Me ayuda a seguir generando ingresos mientras aprendo móvil", 8.0),
            Razon("También me gusta Python, no es sacrificio total", 7.0),
            Razon("Me da bases sólidas de backend que complementan a Kotlin", 6.0)
        )
    )

    val aprenderIngles = Meta(
        "Aprender Inglés",
        demora = 8.0,
        expectativa = 6.5,
        razones = mutableListOf(
            Razon("Acceso a más información técnica y cursos de calidad", 10.0),
            Razon("Mejores oportunidades laborales internacionales como dev móvil", 10.0),
            Razon("Entender mi música, series y videos en inglés", 8.0),
            Razon("Me da ventaja competitiva frente a otros desarrolladores", 9.0)
        )
    )

    val meditar = Meta(
        "Meditar diariamente 5 minutos",
        demora = 1.0,
        expectativa = 7.0,
        razones = mutableListOf(
            Razon("Mejora mi concentración para programar y estudiar", 9.0),
            Razon("Reduce el estrés y la ansiedad crónica que me agota", 9.0),
            Razon("Me ayuda a regular mi sistema nervioso sin pastillas", 8.0),
            Razon("Fortalece mi disciplina mental sin ciclos de autocastigo", 8.0)
        )
    )

    val dejarDeFumar = Meta(
        "Dejar de fumar antes del 12 de marzo",
        demora = 1.0,
        expectativa = 7.0,
        razones = mutableListOf(
            Razon("Es requisito para poder concebir a mi bebé sano", 10.0),
            Razon("Quiero limpiar mi cuerpo de sustancias", 9.0),
            Razon("Mejoraría mi salud física y reduciría la ansiedad", 8.0),
            Razon("Ya tengo fecha límite, sé que puedo lograrlo", 7.0)
        )
    )

    val mejorarElSueno = Meta(
        "Mejorar la calidad del sueño",
        demora = 3.0,
        expectativa = 6.0,
        razones = mutableListOf(
            Razon("Duermo mal y eso arruina mi rendimiento al día siguiente", 9.0),
            Razon("Necesito reducir dependencia de pastillas para dormir", 8.0),
            Razon("Dormir bien me ayuda a estudiar y programar mejor", 9.0),
            Razon("Es base para todo lo demás: ejercicio, bebé, trabajo", 10.0)
        )
    )

    val prepararseParaElBebe = Meta(
        "Prepararme para ser papá en 5 meses",
        demora = 5.0,
        expectativa = 7.5,
        razones = mutableListOf(
            Razon("Es algo que tanto Miri como yo queremos con mucha certeza", 10.0),
            Razon("Quiero ser el que cuide al bebé mientras Miri trabaja", 9.0),
            Razon("Me motiva a ordenar mi salud física y mental", 9.0),
            Razon("Quiero aportar más económicamente antes de que llegue", 8.0),
            Razon("Quiero romper el ciclo y ser la figura paterna que yo no tuve", 10.0)
        )
    )

    hacerEjercicio.calcularMotivacion()
    aprenderKotlin.calcularMotivacion()
    aprenderDjangoYPython.calcularMotivacion()
    aprenderIngles.calcularMotivacion()
    meditar.calcularMotivacion()
    dejarDeFumar.calcularMotivacion()
    mejorarElSueno.calcularMotivacion()
    prepararseParaElBebe.calcularMotivacion()

    imprimirMetasOrdenadas(listOf(
        hacerEjercicio,
        aprenderKotlin,
        aprenderDjangoYPython,
        aprenderIngles,
        meditar,
        dejarDeFumar,
        mejorarElSueno,
        prepararseParaElBebe
    ))
}
