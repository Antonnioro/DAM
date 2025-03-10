package condicionales

fun main(){
    println("Mete un numero del 0 al 10:")

    val numero: Int? = readLine()?.toIntOrNull()

    when (numero){
        0 -> println("Muy suspenso")
        1 -> println("Suspenso")
        2 -> println("Suspenso")
        3 -> println("Suspenso")
        4 -> println("Suspenso")
        5 -> println("Aprobado")
        6 -> println("Bien")
        7 -> println("Notable")
        8 -> println("Notable")
        9 -> println("Sobresaliente")
        10 -> println("Sobresaliente")

        else -> println("Error, mete un numero del 0 al 10")
    }
}