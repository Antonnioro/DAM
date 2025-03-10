package claseCasa

abstract class Vehiculoo(val marca: String) {
    abstract fun acelerar()
    abstract fun frenar()

    fun imprimirMarca() {
        println("Marca del vehículo: $marca")
    }
}

class Cochee(marca: String) : Vehiculoo(marca) {
    override fun acelerar() {
        println("El coche esta acelerando.")
    }

    override fun frenar() {
        println("El coche esta frenando.")
    }
}

fun main() {
    val miCoche = Cochee("Toyota")

    miCoche.imprimirMarca()
    miCoche.acelerar()
    miCoche.frenar()
}
