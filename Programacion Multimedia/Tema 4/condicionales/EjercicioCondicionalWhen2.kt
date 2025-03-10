package condicionales

fun main(){
    println("Mete un numero del 1 al 12:")

    val numero: Int? = readLine()?.toIntOrNull()

    when (numero){
        1 -> println("Enero, Invierno")
        2 -> println("Febrero, Invierno")
        3 -> println("Marzo, Primavera")
        4 -> println("Abril, Primavera")
        5 -> println("Mayo, Primavera")
        6 -> println("Junio, Verano")
        7 -> println("Julio, Verano")
        8 -> println("Agosto, Verano")
        9 -> println("Septiembre, Otoño")
        10 -> println("Octubre, Otoño")
        11 -> println("Noviembre, Otoño")
        12 -> println("Diciembre, Invierno")

        else -> println("Error, mete un numero del 1 al 12")
    }
}