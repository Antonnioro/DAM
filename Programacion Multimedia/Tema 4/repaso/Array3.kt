package repaso

fun main() {
    var arrayEnteroVacio = arrayOfNulls<Int>(3)
    arrayEnteroVacio[0] = 1
    arrayEnteroVacio[1] = 2
    arrayEnteroVacio[2] = 2
    println(arrayEnteroVacio.joinToString())


    for (i in 0 until arrayEnteroVacio.size) {
        println(arrayEnteroVacio[i])
    }

}