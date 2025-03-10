package interfaces

interface ProductoElectronico {
    val nombre: String
    val fabricante: String
    val precio: Double

    fun encender()
    fun apagar()
}

class Televisor(
    override val nombre: String,
    override val fabricante: String,
    override val precio: Double,
    var color: String

) : ProductoElectronico {
    override fun encender() {
        println("Encendiendo el televisor $nombre fabricado por $fabricante")
    }

    override fun apagar() {
        println("Apagando el televisor $nombre.")
    }

    override fun toString(): String {
        return "Datos del televisor: Nombre: $nombre, Fabricante: $fabricante, Precio: $precio, Color: $color"
    }
}

fun main() {
    val miTelevisor = Televisor("Smart TV", "Samsung", 799.99, "Verde")

    println(miTelevisor.toString())
    miTelevisor.encender()
    miTelevisor.apagar()
}