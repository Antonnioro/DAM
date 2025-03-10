package claseCasa

interface Llamable {
    fun hacerLlamada(numero: String)
}

interface EnviadorDeMensajes {
    fun enviarMensaje(contacto: String, mensaje: String)
}

class Teléfono : Llamable, EnviadorDeMensajes {
    override fun hacerLlamada(numero: String) {
        println("El telefono esta llamando al numero $numero")
    }

    override fun enviarMensaje(contacto: String, mensaje: String) {
        println("El telefono esta enviando un mensaje a $contacto: $mensaje")
    }
}

class Ordenador : EnviadorDeMensajes {
    override fun enviarMensaje(contacto: String, mensaje: String) {
        println("El ordenador esta enviando un correo a $contacto: $mensaje")
    }
}

fun main() {
    val telefono = Teléfono()
    telefono.hacerLlamada("123456789")
    telefono.enviarMensaje("Ana", "Hola, Ana ")

    val ordenador = Ordenador()
    ordenador.enviarMensaje("soporte@correo.com", "Solicitud de asistencia.")
}