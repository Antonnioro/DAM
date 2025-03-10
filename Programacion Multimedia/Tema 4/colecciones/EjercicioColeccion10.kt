package colecciones

fun main(){
    val lista: MutableList<String> = mutableListOf("Juan", "Ana", "Pedro", "Carlos")

    println("Lista original: $lista")

    lista[2] = "Andres"
    println("Lista despues de modificar el elemento en la posicion 2: $lista")
}