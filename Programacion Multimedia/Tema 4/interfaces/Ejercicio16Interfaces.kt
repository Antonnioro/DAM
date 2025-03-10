package claseCasa

interface Conducible {
    fun conducir()
}

interface Navegable {
    fun navegar()
}

class CocheEj16 : Conducible {
    override fun conducir() {
        println("El coche esta siendo conducido")
    }
}

class Barco : Navegable {
    override fun navegar() {
        println("El barco esta navegando")
    }
}

class Anfibio : Conducible, Navegable {
    override fun conducir() {
        println("El anfibio esta conduciendo por tierra.")
    }

    override fun navegar() {
        println("El anfibio esta navegando por el agua.")
    }
}

fun main() {
    val coche = CocheEj16()
    coche.conducir()

    val barco = Barco()
    barco.navegar()

    val anfibio = Anfibio()
    anfibio.conducir()
    anfibio.navegar()
}