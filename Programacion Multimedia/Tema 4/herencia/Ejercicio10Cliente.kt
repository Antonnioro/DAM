package claseCasa

abstract class Cliente(
    val nombre: String,
    val apellidos: String,
    val tipo: String,
    val ingresos: Double
) {

    abstract fun asignarOficina()

    fun imprimirDatos() {
        println("Nombre: $nombre $apellidos")
        println("Tipo de cliente: $tipo")
        println("Ingresos: $ingresos")
    }
}

class Atencion(nombre: String, apellidos: String, tipo: String, ingresos: Double) :
    Cliente(nombre, apellidos, tipo, ingresos) {
    override fun asignarOficina() {
        if (tipo == "particular") {
            println("Lo atiende la oficina local.")
        } else if (tipo == "empresa") {
            println("Lo atiende la oficina central.")
        } else {
            println("Tipo de cliente no reconocido.")
        }
    }
}

fun main() {
    val cliente1 = Atencion("Laura", "Gonzalez", "particular", 30000.5)
    val cliente2 = Atencion("Carlos", "Martinez", "empresa", 150000.75)

    cliente1.imprimirDatos()
    cliente1.asignarOficina()

    cliente2.imprimirDatos()
    cliente2.asignarOficina()
}