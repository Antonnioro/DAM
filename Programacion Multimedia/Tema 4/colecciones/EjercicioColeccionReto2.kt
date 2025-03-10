package colecciones

fun main() {
    val mapaNombreEdad: MutableMap<String, Int> =
        mutableMapOf("Juan" to 25, "Ana" to 22, "Pedro" to 30)
    println("Mapa original: $mapaNombreEdad")
    mapaNombreEdad["Laura"] = 28
    println("Mapa despues de agregar: $mapaNombreEdad")
    mapaNombreEdad.remove("Ana", 22)
    println("Mapa despues de eliminar: $mapaNombreEdad")

}