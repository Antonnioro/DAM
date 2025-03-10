package colecciones

fun main() {
    val mapaMutable: MutableMap<String, Int> = mutableMapOf("Uno" to 1, "Dos" to 2)

    mapaMutable["Tres"] = 3

    println(mapaMutable)
}