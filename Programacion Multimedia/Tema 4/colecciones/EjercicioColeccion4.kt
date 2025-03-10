package colecciones

//Lista Ordenada que permite modificar elementos

fun main() {
    val listaMutable: MutableList<String> = mutableListOf("Uno", "Dos")
    listaMutable.add("Tres")
    println(listaMutable)
}