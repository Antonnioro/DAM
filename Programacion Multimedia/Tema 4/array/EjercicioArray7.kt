package array

fun main(){
    var arrayPaises1 = arrayOfNulls<String>(3)

    arrayPaises1[0] = "Alemania"
    arrayPaises1[1] = "Francia"
    arrayPaises1[2] = "Italia"

    var arrayPaises2 = arrayPaises1.copyOf(arrayPaises1.size + 2)
    arrayPaises2[arrayPaises1.size] = "Espana"
    arrayPaises2[arrayPaises1.size + 1] = "Grecia"

    println("Array1: ${arrayPaises1.joinToString(", ")}")
    println("Array2: " + arrayPaises2.joinToString())
}