package variables

fun main(){
    print("Introduce el primer numero:")
    var numero1 = readLine()?.toIntOrNull()?:0

    print("Introduce el segundo numero:")
    var numero2 = readLine()?.toIntOrNull()?:0

    var totalSuma: Int = numero1+numero2
    var totalResta: Int = numero1-numero2
    var totalMulti: Int = numero1*numero2
    var totalDivi: Int = numero1/numero2

    println("El resultado de la suma es " + (numero1+numero2))
    println("La suma es $totalSuma")

    println("El resultado de la resta es " + (numero1-numero2))
    println("La resta es $totalResta")

    println("El resultado de la multiplicacion es " + (numero1*numero2))
    println("La multiplicacion es $totalMulti")

    println("El resultado de la division es " + (numero1/numero2))
    println("La division es $totalDivi")
}