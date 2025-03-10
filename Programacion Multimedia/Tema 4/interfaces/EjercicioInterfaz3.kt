package interfaces

interface Vehiculo {
    val color: String
    val peso: Double
    val numeroRuedas: Int
    val motor: String?

    fun acelerar()
    fun frenar()
}

class Moto(
    override val color: String,
    override val peso: Double,
    override val numeroRuedas: Int = 2,
    override val motor: String,
    val tipo: String
) : Vehiculo {
    override fun acelerar() {
        println("La moto $tipo de color $color esta acelerando.")
    }

    override fun frenar() {
        println("La moto $tipo de color $color esta frenando.")
    }

    override fun toString(): String {
        return "Moto(color='$color', peso=$peso, numeroRuedas=$numeroRuedas, motor='$motor', tipo='$tipo')"
    }
}

class Coche(
    override val color: String,
    override val peso: Double,
    override val numeroRuedas: Int = 4,
    override val motor: String,
    val marca: String
) : Vehiculo {
    override fun acelerar() {
        println("El coche $marca de color $color esta acelerando.")
    }

    override fun frenar() {
        println("El coche $marca de color $color esta frenando.")
    }

    override fun toString(): String {
        return "Coche(color='$color', peso=$peso, numeroRuedas=$numeroRuedas, motor='$motor', marca='$marca')"
    }
}

class Bicicleta(
    override val color: String,
    override val peso: Double,
    override val numeroRuedas: Int = 2,
    override val motor: String? = null,
    val tipo: String
) : Vehiculo {
    override fun acelerar() {
        println("La bicicleta $tipo de color $color esta acelerando.")
    }

    override fun frenar() {
        println("La bicicleta $tipo de color $color esta frenando.")
    }

    override fun toString(): String {
        return "Bicicleta(color='$color', peso=$peso, numeroRuedas=$numeroRuedas, tipo='$tipo')"
    }
}

fun main() {
    val miMoto = Moto("Negro", 180.0, motor = "Yamaha", tipo = "Deportiva")
    val miCoche = Coche("Azul", 1300.0, motor = "Samsung", marca = "Ferrari")
    val miBicicleta = Bicicleta("Roja", 19.9, tipo = "Montaña")

    println(miMoto.toString())
    miMoto.acelerar()
    miMoto.frenar()

    println(miCoche.toString())
    miCoche.acelerar()
    miCoche.frenar()

    println(miBicicleta.toString())
    miBicicleta.acelerar()
    miBicicleta.frenar()
}