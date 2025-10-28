package com.nash12.oop

fun main() {
    val coffeeMachine = CoffeeMachine()
    coffeeMachine.addResources()
    coffeeMachine.addResources()
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
            println("Coffee was done")
            return Coffee()
        } else {
            throw Exception("No enough resources")
        }
    }

    fun addResources() {
        water += 100
        if (water > 150) {
            water = 150
        }
        milk += 100
        if (milk > 150) {
            milk = 150
        }
        seeds += 100
        if (seeds > 150) {
            seeds = 150
        }
        println("Resorces added, now water=$water, milk=$milk, seeds=$seeds")
    }

}


class Coffee
