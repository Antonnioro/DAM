package repaso

fun main() {
    println("Ingrese el primer numero:")
    val numero1 = readLine()?.toIntOrNull() ?: 0


    println("Ingrese el segundo numero:")
    val numero2 = readLine()?.toIntOrNull() ?: 0


    println("Ingrese el tercer numero:")
    val numero3 = readLine()?.toIntOrNull() ?: 0


    val suma = numero1 + numero2 + numero3
    println("La suma de los tres numeros es: $suma")
}
