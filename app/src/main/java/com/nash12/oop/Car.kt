package com.nash12.oop

fun main() {
    val car1 = Car(
        "Kia", "rio", "red", Engine("gas", 55), Gearbox("auto", "new")
    )

    val car2 = Factory.createKia()
    val car3 = Factory.createKia()

    val maxSpeed = car1.max()
    println(maxSpeed)

}
object Factory {
    fun createKia(): Car {
        return Car(
            "Kia", "rio", "red", Engine("gas", 55), Gearbox("auto", "new")
        )

    }
}


class Car(val carBrand: String, model: String, colour: String, val engine: Engine, val gearbox: Gearbox) {

    fun max(): Int {
        if (engine.power>100) {
            return 200
        } else {
            return 50
        }
    }
}

class Engine(val type: String, val power: Int) {

}

class Gearbox(val type: String, condition: String) {

}