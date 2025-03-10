package colecciones

fun main(){
    try {
        val resultado = 10/0
        println("El resultado es: $resultado")
    } catch (e: ArithmeticException){
        println("Error: No se puede dividir por cero")
    }
}