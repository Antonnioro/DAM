package repaso

abstract class Vehiculo(val marca: String) {

    abstract fun acelerar()
    abstract fun frenar()

    fun imprimirMarca() {
        println("Marca del vehiculo: $marca")
    }
}

class Coche(marca: String) : Vehiculo(marca) {
    override fun acelerar() {
        println("El coche esta acelerando.")
    }

    override fun frenar() {
        println("El coche esta frenando.")
    }
}

class Camion(marca: String) : Vehiculo(marca) {
    override fun acelerar() {
        println("El camion esta acelerando.")
    }

    override fun frenar() {
        println("El camion esta frenando.")
    }
}

class Moto(marca: String) : Vehiculo(marca) {
    override fun acelerar() {
        println("La moto esta acelerando.")
    }

    override fun frenar() {
        println("La moto esta frenando.")
    }
}

class Barco(marca: String) : Vehiculo(marca) {
    override fun acelerar() {
        println("El barco esta acelerando.")
    }

    override fun frenar() {
        println("El barco esta frenando.")
    }
}


fun main() {
    val miCoche = Coche("Toyota")
    val miCamion = Camion("Opel")
    val miMoto = Moto("Suzuki")
    val miBarco = Barco("MarcaDeBarco")

    miCoche.imprimirMarca()
    miCoche.acelerar()
    miCoche.frenar()
    println()

    miCamion.imprimirMarca()
    miCamion.acelerar()
    miCamion.frenar()
    println()

    miMoto.imprimirMarca()
    miMoto.acelerar()
    miMoto.frenar()
    println()

    miBarco.imprimirMarca()
    miBarco.acelerar()
    miBarco.frenar()
}
