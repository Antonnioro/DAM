package condicionales

fun main(){
    print("Ingresa el primer valor: ")
    var valor1 = readln().toInt()
    print("Ingresa el segundo valor: ")
    var valor2 = readln().toInt()

    print("Dime tu nombre: ")
    var nombre = readLine()

    if (valor1 < valor2){
        var suma = valor1 + valor2
        var resta = valor1 - valor2
        println("$nombre, los valores son: ")
        println(suma)
        println(resta)

    } else {
        var multi = valor1 * valor2
        var divi = valor1 / valor2
        println("$nombre, los valores son: ")
        println(multi)
        println(divi)
    }
}