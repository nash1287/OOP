package com.nash12.oop.fileConverter

import java.io.File

fun main() {
    val file = File("text.txt")
    var text = file.readText()
    val filteredText = text.filterNot {
       it.isWhitespace()
    }
    file.writeText(filteredText)
    println(filteredText)


}