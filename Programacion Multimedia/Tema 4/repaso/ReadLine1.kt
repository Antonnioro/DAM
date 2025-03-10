package repaso

fun main() {
    println("Ingrese la primera palabra:")
    val palabra1 = readLine() ?: ""


    println("Ingrese la segunda palabra:")
    val palabra2 = readLine() ?: ""


    println("Ingrese la tercera palabra:")
    val palabra3 = readLine() ?: ""


    val resultado = "$palabra1 $palabra2 $palabra3"
    println("La frase completa es: $resultado")
}