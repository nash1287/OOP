package com.nash12.oop

fun main() {
    var capuchino = Coffee("capuchino", 100, 5, 20)
    capuchino.drink()
    capuchino.drink()
    capuchino.drink()

}


class Coffee(val name: String, water: Int, seeds: Int, milk: Int) {

    fun drink () {
        println("drink $name coffee")
    }
}