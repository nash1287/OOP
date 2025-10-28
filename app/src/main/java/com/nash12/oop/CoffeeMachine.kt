package com.nash12.oop

fun main() {
    val coffeeMachine = CoffeeMachine()
    val coffee = coffeeMachine.makeCoffee()
}

class CoffeeMachine {
    fun makeCoffee(): Coffee {
        return Coffee()
    }
}

class Coffee
