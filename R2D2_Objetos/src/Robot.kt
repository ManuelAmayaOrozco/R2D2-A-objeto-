class Robot(var nombre: String) {
    var posX = 0
    var posY = 0
    var dir = 0

    constructor(nombre: String, posX: Int, posY: Int) : this(nombre) {
        this.posX = posX
        this.posY = posY
    }

    constructor(nombre: String, posX: Int) : this(nombre) {
        this.posX
    }

    constructor(nombre: String, posX: Int, posY: Int, dir: Int) : this(nombre) {
        this.posX = posX
        this.posY = posY
        this.dir = dir
    }

    fun moverRobot(vararg movs: Int) {
        //Realizar los movimientos en la dirección en la que este el robot
        for (pasos in movs) {
            when (this.dir) {
                0 -> this.posY += pasos
                1 -> this.posX -= pasos
                2 -> this.posY -= pasos
                3 -> this.posX += pasos
            }

            //Al finalizar cada movimiento añado el giro -90 grados
            if (this.dir == 3) this.dir = 0 else this.dir += 1
        }

    }

    fun direccionRobot() = when (this.dir) {
        0 -> "POSITIVEY"
        1 -> "NEGATIVEX"
        2 -> "NEGATIVEY"
        3 -> "POSITIVEX"
        else -> ""
    }

    fun posicion() {
        println("x: ${this.posX}, y: ${this.posY}, direction: ${direccionRobot()}")
    }

}

fun main() {

    var robot1 = Robot("R2D2")
    var robot2 = Robot("C3PO", 33)

    robot1.moverRobot(10, 5, -2)
    robot1.posicion()

    println()

}