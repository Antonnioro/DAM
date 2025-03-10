package colecciones

fun main() {
    val conjuntoTareas: MutableSet<String> =
        mutableSetOf("Lavar ropa", "Hacer ejercicio", "Estudiar Kotlin")
    println("Tareas pendientes $conjuntoTareas")

    conjuntoTareas.add("Cocinar")
    println("Tareas despues de agregar $conjuntoTareas")

    conjuntoTareas.remove("Hacer ejercicio")
    println("Tareas despues de eliminar $conjuntoTareas")

}