package com.nash12.oop

fun main() {
    val coffeeMachine = CoffeeMachine()
    val coffee = coffeeMachine.makeCoffee()
}

class CoffeeMachine {
    var water = 0
    var milk = 0
    var seeds = 0

    fun makeCoffee(): Coffee {
        if (water >= 30 && milk >= 30 && seeds >= 30) {
            water -= 30
            milk -= 30
            seeds -= 30
            return Coffee()
        } else {
            throw Exception("No enough resources")
        }
    }
}


class Coffee
