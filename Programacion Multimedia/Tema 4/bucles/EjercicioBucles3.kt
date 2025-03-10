package bucles

fun main(){
    println("Tabla de multiplicar del 5")
    var i = 1

    do {
        val resultado = 5 * i
        println("5 * $i = $resultado")
        i++
    } while (i <= 10)
}