package interfaces

interface Producto {
    val nombre: String
    val tarjetaGrafica: String
    val ram: Int
    val precio: Double

    fun encender()
    fun apagar()
}

class Portatil(
    override val nombre: String,
    override val tarjetaGrafica: String,
    override val ram: Int,
    override val precio: Double,
    val procesador: String

) : Producto {
    override fun encender() {
        println("Encendiendo mi portatil $nombre con una $tarjetaGrafica una memoria ram de $ram y un procesador $procesador")
    }

    override fun apagar() {
        println("Apagando mi portatil $nombre.")
    }

    override fun toString(): String {
        return "Datos del portatil: Nombre: $nombre, Tarjeta Grafica: $tarjetaGrafica, Ram: $ram, Procesador: $procesador, Precio: $precio"
    }
}

class Monitor(
    override val nombre: String,
    override val precio: Double,
    val resolucion: String,
    val pulgadas: Int

) : Producto {

    override val tarjetaGrafica: String = "No aplica"
    override val ram: Int = 0

    override fun encender() {
        println("Encendiendo mi portatil $nombre con una resolucion de $resolucion y $pulgadas pulgadas")
    }

    override fun apagar() {
        println("Apagando mi portatil $nombre.")
    }

    override fun toString(): String {
        return "Monitor(nombre='$nombre', precio=$precio, resolucion='$resolucion', pulgadas=$pulgadas)"
    }
}

fun main() {
    val miPortatil = Portatil("Asus ROG", "Nvidia 4090", 64, 1980.99, "Intel I9-14700")

    val miMonitor = Monitor("Asus ROG", 200.28, "4K", 27)

    println(miPortatil.toString())
    miPortatil.encender()
    miPortatil.apagar()

    println(miMonitor.toString())
    miMonitor.encender()
    miMonitor.apagar()
}