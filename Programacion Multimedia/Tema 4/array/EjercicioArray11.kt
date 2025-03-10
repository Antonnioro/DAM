package array

fun main(){
    var array = arrayOfNulls<Int>(5)

    array[0] = 0
    array[1] = 1
    array[2] = 4
    array[3] = 9
    array[4] = 16

    println("Introduce lo que quieras buscar")
    var busqueda = readLine()?.toIntOrNull()?:0

    for (i in 0 .. array.size - 1){
        if (array[i] == busqueda){
            println("El elemento que has buscado se encuentra en la lista. Esta en la posicion " + i)
            break
        } else {
            println("El elemento que has buscado no se encuentra en la lista")
        }
    }
}