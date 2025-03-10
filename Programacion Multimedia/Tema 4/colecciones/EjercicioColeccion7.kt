package colecciones

//ArrayList

fun main(){
    val arrayList: ArrayList<String> = arrayListOf("Elemento1", "Elemento2","Elemento3")
    arrayList.add("Elemento4")
    println("ArrayList: $arrayList")

    println("Primero elemento: ${arrayList[0]}")

    arrayList[1] = "ElementoModificado"

    println("ArrayList despues de modificar: $arrayList")

    arrayList.remove("Elemento3")

    println("ArrayList despues de eliminar: $arrayList")
}