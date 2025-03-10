package array

fun main(){
    // Array que cuenta hacia atrás y tiene saltos
    var arrayValores4 = arrayOf("Pepe", 33, "Paco", 22)
    for (i in arrayValores4.size - 1 downTo 0 step 2){
        println(arrayValores4[i])
    }
}
