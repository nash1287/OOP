package com.nash12.oop

fun main() {
    val input = 3f
    val result = Math().calculateSquareOfRound(input)
    println(result)

}

class Math() {
    val pi = 3.14f
    val e = 2.71

    fun calculateSquareOfRound(radius: Float): Float {
        return pi * radius * radius
    }
}