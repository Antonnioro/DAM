package claseCasa

abstract class Calificacion(val nombre: String, val asignatura: String, var puntos: Int) {
    abstract fun calcularNota()

    fun imprimirDatos() {
        println("Nombre: $nombre")
        println("Asignatura: $asignatura")
        println("Puntos obtenidos: $puntos")
    }
}

class Alumno(nombre: String, asignatura: String, puntos: Int) : Calificacion(nombre, asignatura, puntos) {
    override fun calcularNota() {
        val nota = when {
            puntos in 90..100 -> "Sobresaliente"
            puntos in 80..89 -> "Notable"
            puntos in 70..79 -> "Bien"
            puntos in 60..69 -> "Aprobado"
            puntos in 50..59 -> "Suficiente"
            else -> "Suspenso"
        }
        println("Nota: $nota")
    }
}

fun main() {
    val alumno1 = Alumno("Carlos Perez", "Matematicas", 85)
    val alumno2 = Alumno("Ana Gomez", "Historia", 45)
    val alumno3 = Alumno("Maria Garcia", "Fisica", 92)

    alumno1.imprimirDatos()
    alumno1.calcularNota()

    alumno2.imprimirDatos()
    alumno2.calcularNota()

    alumno3.imprimirDatos()
    alumno3.calcularNota()
}