package com.nash12.oop

fun main() {
    val polyaris = Polyaris()
    val bosh = Bosh()
    val human = Human("Vasya")
    polyaris.addResources(100,100,100)
    val coffeeCappuccino = polyaris.makeCappuccino()
    val coffeeFlatWhite = bosh.makeFlatWhite()
    val juice = Juice()
    val water = Water()
    human.drink(juice)
    human.drink(coffeeCappuccino)
    human.drink(coffeeFlatWhite)
    human.drink(water)


}
class Water(): Drinkable {
    override fun drink() {
        println("drink water")
    }
}



class Juice(): Drinkable {
    override fun drink() {
        println("drink juice")
    }

}

class Human(val name: String) {
    fun drink(drinkable: Drinkable) {
        drinkable.drink()
    }
}

abstract class CoffeeMachine : Turnable, Cleanable, MakeCappuccino, MakeLatte, MakeEspresso {
    var water = 0
    var milk = 0
    var seeds = 0

    abstract val waterMax: Int
    abstract val milkMax: Int
    abstract val seedsMax: Int
    abstract val name: String

    override fun turnOn() {
        println("$name turn On")
    }

    override fun turnOf() {
        println("$name turn Of")
    }

    override fun clean() {
        water = 0
        milk = 0
        seeds = 0
        println("clean was done")
    }

    fun addResources(water:Int,milk:Int,seeds:Int) {
        this.water += water
        if (this.water > waterMax) {
            this.water = waterMax
        }
        this.milk += milk
        if (this.milk > milkMax) {
            this.milk = milkMax
        }
        this.seeds += seeds
        if (this.seeds > seedsMax) {
            this.seeds = seedsMax
        }
        println("Resorces added, now water=$water, milk=$milk, seeds=$seeds")
    }
}

class Polyaris : CoffeeMachine() {
    override val waterMax: Int = 150
    override val milkMax: Int = 150
    override val seedsMax: Int = 150
    override val name: String = "Polyaris"
    override fun makeLatte(): Latte {
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



    override fun makeEspresso(): Espresso {
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

    override fun makeCappuccino(): Cappuccino {
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
}

class Bosh : CoffeeMachine(), MakeFlatWhite {
    override val waterMax: Int = 250
    override val milkMax: Int = 250
    override val seedsMax: Int = 250
    override val name: String = "Bosh"
    override fun makeLatte(): Latte {
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

    override fun makeEspresso(): Espresso {
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

    override fun makeCappuccino(): Cappuccino {
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
    override fun makeFlatWhite(): FlatWhite {
        if (water >= 30 && milk >= 30 && seeds >= 30) {
            water -= 30
            milk -= 30
            seeds -= 30
            println("")
            val flatWhite = FlatWhite()
            println("coffee name= ${flatWhite.name}")
            return flatWhite
        } else {
            throw Exception("No enough resources")
        }
    }
}


interface Turnable {
    fun turnOn()
    fun turnOf()
}

interface Cleanable {
    fun clean()
}

interface MakeCappuccino {
    fun makeCappuccino(): Cappuccino
}

interface MakeLatte {
    fun makeLatte(): Latte
}

interface MakeEspresso {
    fun makeEspresso(): Espresso
}

interface MakeFlatWhite {
    fun makeFlatWhite(): FlatWhite
}


interface Drinkable {
    fun drink()

}


abstract class Coffee : Drinkable {
    abstract val name: String
    override fun drink() {
        println("drink $name")
    }
}

class Cappuccino() : Coffee() {
    override val name: String = "Cappuccino"
}

class Latte() : Coffee() {
    override val name: String = "Latte"
}

class Espresso() : Coffee() {
    override val name: String = "Espresso"

}

class FlatWhite() : Coffee() {
    override val name: String = "FlatWhite"

}

