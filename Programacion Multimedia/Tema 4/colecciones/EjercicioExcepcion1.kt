package colecciones

fun main(){
    try {
        var entero: Int = Integer.parseInt("a")
    } catch (e: NumberFormatException){
        println("La hemos cagao")
    }
}