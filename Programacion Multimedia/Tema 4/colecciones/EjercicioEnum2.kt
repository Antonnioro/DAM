package colecciones

enum class Mes {
    ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE
}

class NumeroDias {


    fun contar(numero: Mes) {
        when (numero) {
            Mes.ENERO -> println("El mes de Enero tiene 31 dias")
            Mes.FEBRERO -> println("El mes de Febrero tiene 28 dias")
            Mes.MARZO -> println("El mes de MARZO tiene 31 dias")
            Mes.ABRIL -> println("El mes de ABRIL tiene 30 dias")
            Mes.MAYO -> println("El mes de MAYO tiene 31 dias")
            Mes.JUNIO -> println("El mes de JUNIO tiene 30 dias")
            Mes.JULIO -> println("El mes de JULIO tiene 31 dias")
            Mes.AGOSTO -> println("El mes de AGOSTO tiene 31 dias")
            Mes.SEPTIEMBRE -> println("El mes de SEPTIEMBRE tiene 30 dias")
            Mes.OCTUBRE -> println("El mes de OCTUBRE tiene 31 dias")
            Mes.NOVIEMBRE -> println("El mes de NOVIEMBRE tiene 30 dias")
            Mes.DICIEMBRE -> println("El mes de DICIEMBRE tiene 31 dias")
        }
    }
}

fun main() {
    val numeroDias = NumeroDias()

    numeroDias.contar(Mes.MARZO)
    numeroDias.contar(Mes.FEBRERO)
}