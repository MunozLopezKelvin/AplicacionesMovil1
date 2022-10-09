fun main() {
    val dado1 = Dice(6)
    println("_____________________________________________")
    println("Tu dado de ${dado1.numcaras} caras, dio como resultado: ${dado1.lanzar()}")
    println("_____________________________________________")
    val dado2 = Dice(15)
    println("Tu dado de ${dado2.numcaras} caras, dio como resultado: ${dado2.lanzar()}")
    println("_____________________________________________")
}

class Dice (val numcaras: Int) {
    fun lanzar(): Int {
        return (1..numcaras).random()
    }
}

