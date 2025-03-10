package funciones

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

fun potencia(a: Int): Int {
    var resultado = a * a
    return resultado
}

fun raiz(a: Number): Double {
    var resultado = Math.sqrt(a as Double)
    return resultado
}

fun pedirNumero(): Pair<Int, Int> {
    print("Introduce un numero: ")
    var numero1 = readLine()?.toIntOrNull() ?: 0
    print("Introduce el segundo numero: ")
    var numero2 = readLine()?.toIntOrNull() ?: 0
    return Pair(numero1, numero2)
}

fun main(){

    var verdadFalso = false

    while(verdadFalso == false){
        println("Indica la opcion 1 sumar, 2 restar, 3 multiplicar, 4 dividir, 5 potencia, 6 raiz, 7 salir")
        var opcion = readLine()?.toIntOrNull()

        when (opcion){
            1-> {
                var (numero1, numero2) = pedirNumero()
                var resultadoSuma = sumar(numero1, numero2)
                println("La suma es $resultadoSuma")
            }
            2-> {
                var (numero1, numero2) = pedirNumero()
                var resultadoResta = restar(numero1, numero2)
                println("La resta es $resultadoResta")
            }
            3-> {
                var (numero1, numero2) = pedirNumero()
                var resultadoMultiplicacion = multiplicar(numero1, numero2)
                println("La multiplicacion es $resultadoMultiplicacion")
            }
            4-> {
                var (numero1, numero2) = pedirNumero()
                var resultadoDivision = dividir(numero1, numero2)
                println("La division es $resultadoDivision")
            }
            5-> {
                print("Introduce el numero para la potencia: ")
                var numero1 = readLine()?.toIntOrNull()?:0
                var resultadoPotencia = potencia(numero1)
                println("La potencia es $resultadoPotencia")
            }

            6-> {
                print("Introduce el numero para la raiz: ")
                var numero3 = readLine()?.toDoubleOrNull()?:0
                var resultadoRaiz = raiz(numero3)
                println("La raiz es $resultadoRaiz")
            }

            7-> verdadFalso = true
            else -> println("Error de eleccion")
        }
    }
}