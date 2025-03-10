package array

fun main(){
    var arrayEmpresa1 = arrayOfNulls<String>(3)

    arrayEmpresa1[0] = "Microsoft"
    arrayEmpresa1[1] = "Meta"
    arrayEmpresa1[2] = "Apple"

    var arrayEmpresa2 = arrayEmpresa1.copyOf(arrayEmpresa1.size + 5)
    arrayEmpresa2[arrayEmpresa1.size] = "Samsung"
    arrayEmpresa2[arrayEmpresa1.size + 1] = "Lenovo"
    arrayEmpresa2[arrayEmpresa1.size + 2] = "Xiaomi"
    arrayEmpresa2[arrayEmpresa1.size + 3] = "Intel"
    arrayEmpresa2[arrayEmpresa1.size + 4] = "AMD"

    println("Array1: ${arrayEmpresa1.joinToString(", ")}")
    println("Array2: " + arrayEmpresa2.joinToString())
}