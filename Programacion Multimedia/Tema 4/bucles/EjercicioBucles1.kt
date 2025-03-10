package bucles

fun main(){
    for (a in 0..10){
        println(a)
    }

    for (b in 10  downTo  0 step 2){
        println(b)
    }

    for (z in 2..10){
        println(z)
    }

    for (g in 4..20){
        println(g)
    }

    var numero = 10
    var n1 = 0
    var n2 = 1

    print("Primeros $numero numeros: ")

    for (i in 1..numero){
        print("$n1 ")

        var suma = n1 + n2
        n1 = n2
        n2 = suma
    }
}