package constructores

class Alumnos(
    var nif: String,
    var nombre: String,
    var apellidos: String,
    var genero: String,
    var edad: Int,
    var curso: String //Campo con valor predeterminado
)

{
    constructor(nombre: String, apellidos: String) : this("", nombre, apellidos, "", 0, "DAM"){
        println("Primer constructor secundario llamado")
    }

    constructor(nif: String, nombre: String, apellidos: String) : this(nif, nombre, apellidos, "", 0, "DAM"){
        println("Segundo constructor secundario llamado")
    }

    constructor(nombre: String, genero: String, edad: Int) : this("", nombre, "", genero, edad, "DAM"){
        println("Tercer constructor secundario llamado")
    }

    fun mostrarDetalles(){
        println("Nombre: $nombre, Apellido: $apellidos, Curso: $curso")
    }

    fun mostrarDetallesConNif(){
        println("NIF: $nif, Nombre: $nombre, Apellido: $apellidos, Curso: $curso")
    }

    fun mostrarDetallesConGenero(){
        println("Nombre: $nombre, Genero: $genero, Curso: $curso")
    }

}

fun main(){
    val alumno1 = Alumnos("Pedro", "Fernandez")
    alumno1.mostrarDetalles()

    val alumno2 = Alumnos("111222333Z","Pedro", "Fernandez")
    alumno2.mostrarDetallesConNif()

    val alumno3 = Alumnos("Maria", "Mujer", 5)
    alumno3.mostrarDetallesConGenero()
}