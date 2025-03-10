package array

fun main(){
    var arrayMultitipo1 = arrayOf(1, "table", 2, "Monitor")


    var arrayMultitipo2 = arrayMultitipo1.copyOf(arrayMultitipo1.size + 4)
    arrayMultitipo2[arrayMultitipo1.size] = 3
    arrayMultitipo2[arrayMultitipo1.size + 1] = "Portatil"
    arrayMultitipo2[arrayMultitipo1.size + 2] = 4
    arrayMultitipo2[arrayMultitipo1.size + 3] = "Movil"

    println("Array1: ${arrayMultitipo1.joinToString(", ")}")
    println("Array2: " + arrayMultitipo2.joinToString())
}