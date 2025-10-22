package com.nash12.oop

fun main() {
    val titanik = Ship("Titanik", maxSpeed = 20, permissibleSpeed = 39)
    titanik.sendSpeedShip(40)
    val admiral = Ship(name = "Vasya", maxSpeed = 25, permissibleSpeed = 39)
    admiral.sendSpeedShip(30)
}


class Ship(val name: String, val maxSpeed: Int, val permissibleSpeed: Int) {
    fun sendSpeedShip(currentSpeed: Int) {
        if (currentSpeed > maxSpeed) {
            println("$name will crash into an iceberg")
        } else if (currentSpeed < permissibleSpeed) {
            println("$name is ok")
        }
        println("dangeros")
    }
}
