package herencia

abstract class Animales(val nombre: String, val edad: Int) {
    abstract fun hacerSonido()
    fun dormir() {
        println("$nombre esta durmiendo")
    }
}

interface Mascota {
    val dueno: String
    fun jugar()
}

interface Domesticado {
    val entrenamiento: String
    fun entrenar()
}

class Perros(
    nombre: String,
    edad: Int,
    override val dueno: String,
    override val entrenamiento: String
) : Animales(nombre, edad), Mascota, Domesticado {

    override fun hacerSonido() {
        println("$nombre el perro ladra")
    }

    override fun jugar() {
        println("$nombre esta jugando con su dueno $dueno")
    }

    override fun entrenar() {
        println("$nombre esta siendo entrenado para $entrenamiento")
    }
}

fun main() {
    val miPerro = Perros("Rex", 4, "Carlos", "obediencia")

    miPerro.hacerSonido()
    miPerro.jugar()
    miPerro.entrenar()
    miPerro.dormir()
}