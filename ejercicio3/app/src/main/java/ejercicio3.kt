
fun main() {
    val dado = Lanzamiento(6)
    val resultado = dado.lanzar()
    val numwin = 5

    println("______________________________________________________________")
    when (resultado) {
        numwin -> println("El giro dio como resultado 5. !!Felicidades, has ganado!!")
        1 -> println("El giro dio como resultado 1. Inténtalo de nuevo, suerte!")
        2 -> println("El giro dio como resultado 2. Inténtalo de nuevo, suerte!")
        3 -> println("El giro dio como resultado 3. Inténtalo de nuevo, suerte!")
        5 -> println("El giro dio como resultado 4. Inténtalo de nuevo, suerte!")
        6 -> println("El giro dio como resultado 6. Inténtalo de nuevo, suerte!")
    }
    println("______________________________________________________________")
}

class Lanzamiento(val caras: Int) {
    fun lanzar(): Int {
        return (1..caras).random()
    }
}