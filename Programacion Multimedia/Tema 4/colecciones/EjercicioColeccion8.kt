package colecciones

fun main(){
    val numbers = listOf(1,2,3,4,5)
    val evenNumbers = numbers.filter { it % 2 == 0 } //Filtrar numeros pares

    println("Numero pares: $evenNumbers")
}