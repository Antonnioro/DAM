package constructores

class Profesores(var nombre: String, var apellido: String, var edad: Int, var puesto: String){

    constructor(nombre: String, apellido: String, edad: Int) : this(nombre, apellido, 0, ""){
        println("Constructor secundario llamado. La edad no ha sido proporcionada. Por defecto es 0")
    }

    constructor(nombre: String, apellido: String) : this(nombre, apellido, 0, ""){
        println("Constructor también secundario llamado. La edad no ha sido proporcionada. Por defecto es 0")
    }

    constructor(nombre: String) : this(nombre, "", 0,""){
        println("Constructor terciario llamado. Ni el apellido ni la edad han sido proporcionadas. Por defecto es 0 o las comillas")
    }

    constructor(nombre: String, apellido: String, puesto: String) : this(nombre, apellido, 0, puesto){
        println("Constructor cuaternario llamado.")
    }

    fun mostrarDetalles(){
        println("Nombre: $nombre, Apellido: $apellido, Edad: $edad")
    }

    fun mostrarDetallesExtra(){
        println("Nombre: $nombre, Apellido: $apellido, Puesto: $puesto")
    }

    fun mostrarNombre(){
        println("Nombre: $nombre")
    }
}

fun main(){
    val profesor1 = Profesores("Juan", "Perez", 25)
    profesor1.mostrarDetalles()

    val profesor2 = Profesores("Laura", "Palomo")
    profesor2.mostrarDetalles()

    val profesor3 = Profesores("Manolo")
    profesor3.mostrarNombre()

    val profesor4 = Profesores("Evaristo", "Hernandez", "Profesor")
    profesor4.mostrarDetallesExtra()
}