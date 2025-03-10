package array

fun main (){
    val array2d2 = arrayOf(arrayOf("Alberto", 1, "Victor", 2), arrayOf(35, -20, 16))

    for (fila in array2d2) {
        println("Imprime columna")
        for (elemento in fila) {
            println("Imprime Fila")
            println(elemento)
        }
    }
}