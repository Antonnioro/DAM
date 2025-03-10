package claseCasa

abstract class Salario(val nombre: String, var dinero: Int) {
    abstract fun complemento()
    abstract fun estatus()

    fun imprimirDatos() {
        println("Nombre: $nombre tiene unos ingresos de $dinero")
    }
}

class Persona(nombre: String, dinero: Int) : Salario(nombre, dinero) {
    override fun complemento() {
        val incremento: Double

        if (dinero > 3000){
            incremento = dinero*0.2
        } else if (dinero in 2000..3000){
            incremento = dinero*0.1
        } else {
            incremento = dinero*0.05
        }

        println("Se complemento es: $incremento")
    }

    override fun estatus() {
        if (dinero >= 2000){
            println("Eres rico")
        } else {
            println("No esta mal, podria ser peor.")
        }

    }
}

fun main() {
    val miPersona1 = Persona("Cristina", 2500)
    val miPersona2 = Persona("Laura", 1000)

    miPersona1.imprimirDatos()
    miPersona1.complemento()
    miPersona1.estatus()

    miPersona2.imprimirDatos()
    miPersona2.complemento()
    miPersona2.estatus()
}