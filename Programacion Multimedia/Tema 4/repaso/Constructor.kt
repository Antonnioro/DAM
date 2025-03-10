package repaso

class Profesor
    (
    var nif: String,
    var nombre: String,
    var apellidos: String,
    var genero: String,
    var edad: Int = 0
) {
    constructor (
        nombre: String,
        apellidos: String, genero: String
    ) : this(
        "", nombre, apellidos, genero
    )
}

fun main() {
    var p: Profesor = Profesor("123", "Alberto", "Ruiz", "Hombre")
    var p1: Profesor = Profesor("123", "Eva", "Ruiz", "Mujer", 40)
    var p2: Profesor = Profesor("Juan", "Perez", "Hombre")

    println("Nombre: ${p.nombre}, nif: ${p.nif}, apellidos: ${p.apellidos}, genero: ${p.genero}")
    p.edad = 34
    println("La edad es ${p.edad}")
    println("Nombre: ${p2.nombre}, apellidos: ${p2.apellidos}, genero: ${p2.genero}")
    println("Nombre: ${p1.nombre}, nif: ${p1.nif}, apellidos: ${p1.apellidos}, genero: ${p1.genero}, " + " edad:  ${p1.edad}"
    )
}