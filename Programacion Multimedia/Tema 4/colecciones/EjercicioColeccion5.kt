package colecciones

//Conjunto de elementos unicos que permite modificaciones

fun main() {
    val conjuntoMutable: MutableSet<String> = mutableSetOf("Uno", "Dos")

    conjuntoMutable.add("Tres")

    println(conjuntoMutable)
}