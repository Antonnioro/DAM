package condicionales

fun main(){
    print("¿Piedra(1) papel(2) o tijeras(3)?")
    var humano = readln().toInt()
    var maquina:Int=(1..3).random()

    print("Tu has elegido $humano y la maquina ha elegido $maquina, ")

    if (humano == 1){
        if (maquina == 1){
            print("empate")
        } else if (maquina == 2){
            print("has perdido")
        } else {
            print("has ganado")
        }

    } else if (humano == 2){
        if (maquina == 1){
            print("has ganado")
        } else if (maquina == 2){
            print("empate")
        } else {
            print("has perdido")
        }
    } else {
        if (maquina == 1){
            print("has perdido")
        } else if (maquina == 2){
            print("Has ganado")
        } else {
            print("empate")
        }
    }
}