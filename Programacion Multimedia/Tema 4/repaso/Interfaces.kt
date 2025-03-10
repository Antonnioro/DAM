package repaso

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
    var color: String,

    ) : ProductoElectronico {

    override fun encender() {
        println("Encendiendo el televisor $nombre fabricado por $fabricante.")
    }

    override fun apagar() {
        println("Apagando el televisor $nombre.")
    }
}

class Lavadora(
    override val nombre: String,
    override val fabricante: String,
    override val precio: Double,
    var color: String,

    ) : ProductoElectronico {

    override fun encender() {
        println("Encendiendo la lavadora $nombre fabricada por $fabricante.")
    }

    override fun apagar() {
        println("Apagando la lavadora $nombre.")
    }
}

class Portatil(
    override val nombre: String,
    override val fabricante: String,
    override val precio: Double,
    var color: String,

    ) : ProductoElectronico {

    override fun encender() {
        println("Encendiendo el portatil $nombre fabricado por $fabricante.")
    }

    override fun apagar() {
        println("Apagando el portatil $nombre.")
    }
}

class Impresora(
    override val nombre: String,
    override val fabricante: String,
    override val precio: Double,
    var color: String,

    ) : ProductoElectronico {

    override fun encender() {
        println("Encendiendo la impresora $nombre fabricada por $fabricante.")
    }

    override fun apagar() {
        println("Apagando la impresora $nombre.")
    }
}


fun main() {

    val miTelevisor = Televisor("Smart TV", "Lomonaco", 799.99, "Verde")
    val miLavadora = Lavadora("Lavadora Random", "Samsung", 399.99, "Metalica")
    val miPortatil = Portatil("Logitech", "LG", 1400.99, "Gris")
    val miImpresora = Impresora("Impresora fotografica", "Canon", 49.99, "Blanca")

    println("Nombre: ${miTelevisor.nombre}")
    println("Fabricante: ${miTelevisor.fabricante}")
    println("Precio: ${miTelevisor.precio} Euros")
    println("Color es ${miTelevisor.color}")

    miTelevisor.encender()
    miTelevisor.apagar()
    println()

    println("Nombre: ${miLavadora.nombre}")
    println("Fabricante: ${miLavadora.fabricante}")
    println("Precio: ${miLavadora.precio} Euros")
    println("Color es ${miLavadora.color}")

    miLavadora.encender()
    miLavadora.apagar()
    println()

    println("Nombre: ${miPortatil.nombre}")
    println("Fabricante: ${miPortatil.fabricante}")
    println("Precio: ${miPortatil.precio} Euros")
    println("Color es ${miPortatil.color}")

    miPortatil.encender()
    miPortatil.apagar()
    println()

    println("Nombre: ${miImpresora.nombre}")
    println("Fabricante: ${miImpresora.fabricante}")
    println("Precio: ${miImpresora.precio} Euros")
    println("Color es ${miImpresora.color}")

    miImpresora.encender()
    miImpresora.apagar()
}