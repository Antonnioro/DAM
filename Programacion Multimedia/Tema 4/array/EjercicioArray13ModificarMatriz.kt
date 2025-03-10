package array

fun main(){
    var matrizEnteros = arrayOf(intArrayOf(12, 15, 21, 45), intArrayOf(14, 25, 16), intArrayOf(23, 24))

    //Metodo tradicional

    println("Valor original: ${matrizEnteros[0][2]}")
    matrizEnteros[0][2] = 50
    println("Valor cambiado a 50: ${matrizEnteros[0][2]}")

    //Usando set

    matrizEnteros[0].set(2, 110)
    println("Valor cambiado con set a 110: ${matrizEnteros[0][2]}")
}