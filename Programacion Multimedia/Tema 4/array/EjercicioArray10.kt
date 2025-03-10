package array

fun main() {
    var array1 = arrayOfNulls<Int>(3)
    var suma = 0

    array1[0] = 10
    array1[1] = 5
    array1[2] = 8

    for (i in 0 until array1.size) {
        var total = array1[i] ?: 0
        suma += total
    }

    val media = suma / array1.size

    println("La media es $media")
}