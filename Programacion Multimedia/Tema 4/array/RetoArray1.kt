package array

//Array 3 numero enteros, hacer dos copias, añadiendo a cada una un numero extra

fun main(){
    var array1 = arrayOfNulls<Int>(3)

    array1[0] = 1
    array1[1] = 2
    array1[2] = 3

    var array2 = array1.copyOf(array1.size + 1)
    array2[array1.size] = 4

    var array3 = array2.copyOf(array2.size + 1)
    array3[array2.size] = 5

    println("Array1: ${array1.joinToString(", ")}")
    println("Array2: " + array2.joinToString())
    println("Array3: " + array3.joinToString())
}