package colecciones

fun main(){
    val listaNotas: MutableList<Double> = mutableListOf(7.5, 8.2, 9.0, 6.8)

    println("Lista original: $listaNotas")

    listaNotas[1] = 8.5

    println("Lista modificada: $listaNotas")

}