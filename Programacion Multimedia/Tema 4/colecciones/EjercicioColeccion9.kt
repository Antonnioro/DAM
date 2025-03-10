package colecciones

fun main(){
    val lista: MutableList<String> = mutableListOf("Juan", "Ana", "Pedro", "Carlos")

    println("Lista original: $lista")

    lista.removeAt(1)
    println("Lista despues de eliminar el elemento en la posicion 1: $lista")

    lista.remove("Carlos")
    println("Lista despues de eliminar el elemento 'Carlos': $lista")
}