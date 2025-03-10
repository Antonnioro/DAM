package array

fun main(){
    var arrayValores = arrayOf("Maria", "Hernandez", "Calle Sonsoles", "Madrid", "Pepe", "Heredia", "Calle Inundacion", "Sevilla", "Mauricia", "Mendoza", "Avenida Sin Venir", "Malaga")
    for (i in 1 until arrayValores.size step 4){
        println(arrayValores[i])
    }

    var arrayValores1 = arrayOf("Maria", "Hernandez", "Calle Sonsoles", "Madrid", "Pepe", "Heredia", "Calle Inundacion", "Sevilla", "Mauricia", "Mendoza", "Avenida Sin Venir", "Malaga")
    for (i in arrayValores1.size - 3 downTo 0 step 4){
        println(arrayValores1[i])
    }
}