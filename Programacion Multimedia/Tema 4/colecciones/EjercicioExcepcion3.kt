package colecciones

fun main(){
    val array = arrayOf(1,2,3)

    try{
        println("Valor en el índice 5: ${array[5]}")
    } catch (e: ArrayIndexOutOfBoundsException){
        println("Error: Indice fuera de rango")
    }
}