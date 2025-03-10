package repaso


fun sumar(a: Int, b: Int): Int {
    var resultado = a + b
    return resultado
}

fun restar(a: Int, b: Int): Int {
    var resultado = a - b
    return resultado
}

fun multiplicar(a: Int, b: Int): Int {
    var resultado = a * b
    return resultado
}

fun dividir(a: Int, b: Int): Int {
    var resultado = a / b
    return resultado
}

fun main() {
    print("Indicame un numero: ")
    var numero1 = readLine()?.toIntOrNull() ?: 0

    print("Indicame otro numero: ")
    var numero2 = readLine()?.toIntOrNull() ?: 0

    var resultado = sumar(numero1, numero2)
    var resultado2 = restar(numero1, numero2)
    var resultado3 = multiplicar(numero1, numero2)
    var resultado4 = dividir(numero1, numero2)

    println("La suma es $resultado")
    println("La resta es $resultado2")
    println("La multiplicacion es $resultado3")
    println("La division es $resultado4")
}
