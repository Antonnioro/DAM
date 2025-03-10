package repaso

fun main(){

    println("Mete el numero del que quieras saber la tabla de multiplicar")
    val numero = readLine()?.toIntOrNull() ?: 0

    println("Tabla del $numero")

    for (i in 0..10){
        println("$numero * $i = " + numero*i)
    }

    println("Mete el otro numero del que quieras saber la tabla de multiplicar")
    val numero2 = readLine()?.toIntOrNull() ?: 0

    println("Tabla del $numero2")

    var i2 = 0

    while (i2 < 10) {
        println("$numero2 * $i2 = " + numero2*i2)
        i2++
    }
}
