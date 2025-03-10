package claseCasa

// Definición de la interfaz
interface Vehiculo {
    fun arrancar()
    fun detener()
}

// Implementación de la interfaz en la clase Coche
class Coche : Vehiculo {
    override fun arrancar() {
        println("El coche esta arrancando.")
    }

    override fun detener() {
        println("El coche se ha detenido.")
    }
}

// Implementación de la interfaz en la clase Bicicleta
class Bicicleta : Vehiculo {
    override fun arrancar() {
        println("La bicicleta esta empezando a moverse.")
    }

    override fun detener() {
        println("La bicicleta se ha detenido.")
    }
}

fun main() {
    val coche = Coche()
    val bicicleta = Bicicleta()

    coche.arrancar()
    coche.detener()

    bicicleta.arrancar()
    bicicleta.detener()
}
