package condicionales

fun main(){
    println("Mete un numero del 1 al 8:")

    val numero: Int? = readLine()?.toIntOrNull()

    when (numero){
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miercoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6 -> println("Sabado")
        7 -> println("Domingo")
        8 -> println("Dia inventado")

        else -> println("Error, mete un numero del 1 al 8")
    }
}