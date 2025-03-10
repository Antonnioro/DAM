package colecciones

import java.util.TreeMap

//Coleccion de pares clave-valor. Las claves deben ser unicas.

fun main() {
    val mapa: Map<String, Int> = mapOf("Uno" to 1, "Dos" to 2, "Tres" to 3)
    println(mapa)

    var mapa1: TreeMap<String, Int> = TreeMap<String, Int>()
    mapa1.put("a", 3)
    mapa1.put("c", 1)
    mapa1.put("b", 2)

    println("TreeMap ordenado: $mapa1")

}