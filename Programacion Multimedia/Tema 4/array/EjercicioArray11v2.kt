package array

fun main(){
    var array = arrayOf(11, 22, 33, 44, 55)

    println("Introduce lo que quieras buscar")
    var valor_buscado = readLine()?.toIntOrNull()?:0

    var busqueda = array.contains(valor_buscado)
    var posicion = array.indexOf(valor_buscado)

    if (busqueda == true){
        println("Encontrado en la posicion $posicion")
    } else {
        println("No encontrado")
    }
}