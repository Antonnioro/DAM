package funciones

fun main(){
    var totalImporte : Double

    println("Cuantas unidades vas a comprar?")
    var unidades = readLine()?.toIntOrNull() ?: 0

    println("Cuanto cuesta cada una?")
    var importe = readLine()?.toDoubleOrNull() ?: 0.00

    var total = unidades * importe

    if (total > 1000){
        totalImporte = total - (total * 10 / 100)
    } else {
        totalImporte = total
    }

    var totalPagar : Double = totalImporte + (totalImporte * 21 / 100)

    println("Unidades: " + unidades)
    println("Importe: " + importe)
    println("Total: " + total)
    println("Total Importe: " + totalImporte)
    println("Total a pagar: " + totalPagar)
}