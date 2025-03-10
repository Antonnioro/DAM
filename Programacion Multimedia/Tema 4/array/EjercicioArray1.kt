package array

fun main(){
    val arrayValores = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (i in 0 until arrayValores.size){
        println(arrayValores[i])
    }

    var arrayValores2 = arrayOf("A", "B", "C")
    for (i in 0 until arrayValores2.size){
        println(arrayValores2[i])
    }

    var arrayValores3 = arrayOf("Laura", 30, "Ana", 24)
    for (i in 0 until arrayValores3.size){
        println(arrayValores3[i])
    }
}