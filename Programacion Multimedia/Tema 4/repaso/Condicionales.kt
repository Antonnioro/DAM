package repaso

fun main() {
    println("Ingrese el primer numero:")
    val num1 = readLine()?.toIntOrNull() ?: return println("Entrada no valida")

    println("Ingrese el segundo numero:")
    val num2 = readLine()?.toIntOrNull() ?: return println("Entrada no valida")

    if (num1 > num2) {
        println("$num1 es mayor que $num2")
    } else if (num1 < num2) {
        println("$num1 es menor que $num2")
    } else {
        println("$num1 es igual a $num2")
    }
}