package colecciones

fun main(){
    val nombre : String? = null

    try {
        println("La longitud del nombre es: ${nombre!!.length}")
    } catch (e: NullPointerException){
        println("Error: Intentaste acceder a un valor nulo")
    }
}