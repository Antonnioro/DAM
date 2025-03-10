package array

fun main(){
    var array1 = arrayOfNulls<String>(3)

    array1[0] = "A"
    array1[1] = "B"
    array1[2] = "C"

    var array2 = array1.copyOf(array1.size + 1)
    array2[array1.size] = "0"

    println("Array1: ${array1.joinToString(", ")}")
    println("Array2: " + array2.joinToString())
}