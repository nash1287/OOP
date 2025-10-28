package com.nash12.oop

fun main() {
    val coffeeMachine = CoffeeMachine()
    coffeeMachine.addResources()
    coffeeMachine.addResources()
    coffeeMachine.clean()
    val coffee = coffeeMachine.makeCappuccino()

}

class CoffeeMachine {
    var water = 0
    var milk = 0
    var seeds = 0

    fun makeCappuccino(): Cappuccino {
        if (water >= 30 && milk >= 30 && seeds >= 30) {
            water -= 30
            milk -= 30
            seeds -= 30
            println("")
            val cappuccino = Cappuccino()
            println("coffee name= ${cappuccino.name}")
            return cappuccino
        } else {
            throw Exception("No enough resources")
        }
    }

    fun makeLate(): Latte {
        if (water >= 40 && milk >= 40 && seeds >= 40) {
            water -= 40
            milk -= 40
            seeds -= 40
            val latte = Latte()
            println("coffee name= ${latte.name}")
            return latte
        } else {
            throw Exception("No enough resources")
        }

    }

    fun makeEspresso(): Espresso {
        if (water >= 50 && seeds >= 50) {
            water -= 50

            seeds -= 50
            val espresso = Espresso()
            println("coffee name= ${espresso.name}")
            return espresso
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

    fun clean() {
        water = 0
        milk = 0
        seeds = 0
        println("clean was done")
    }

}

abstract class Coffee

class Cappuccino() : Coffee() {
    val name = "Cappuccino"
}

class Latte() : Coffee() {
    val name = "Latte"
}

class Espresso() : Coffee() {
    val name = "Espresso"
}
