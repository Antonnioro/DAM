package array

fun main(){
    val arrayVacio = arrayOfNulls<String>(3)
    arrayVacio[0] = "Coin"
    arrayVacio[1] = "Cartama"
    arrayVacio[2] = "Alora"

    for (i in 0 until arrayVacio.size){
        println(arrayVacio[i])
    }

    println("Usando joinToString " + arrayVacio.joinToString())
    //joinTo concatena elementos añadiendo una coma entre ellos

    println("Usando get(0) " + arrayVacio.get(0))


    var arrayEnteroVacio = arrayOfNulls<Int>(3)
    arrayEnteroVacio[0] = 1
    arrayEnteroVacio[1] = 2
    arrayEnteroVacio[2] = 2

    println("usando joinToString " + arrayEnteroVacio.joinToString())

    for (i in 0 until arrayEnteroVacio.size){
        println(arrayEnteroVacio[i])
    }

}