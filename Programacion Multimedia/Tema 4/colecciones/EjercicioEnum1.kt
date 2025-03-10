package colecciones

enum class DiaSemana{
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
}

class Actividad {
    fun planificar(dia: DiaSemana){
        when (dia){
            DiaSemana.LUNES -> println("Ir al gimnasio")
            DiaSemana.MARTES -> println("Estudiar programacion")
            DiaSemana.MIERCOLES -> println("Reunion con el equipo")
            DiaSemana.JUEVES -> println("Dia libre")
            DiaSemana.VIERNES -> println("Cena con amigos")
            DiaSemana.SABADO, DiaSemana.DOMINGO -> println("Descanso total")
        }
    }
}

fun main(){
    val actividad = Actividad()

    actividad.planificar(DiaSemana.LUNES)
    actividad.planificar(DiaSemana.SABADO)
}