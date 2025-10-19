package com.nash12.oop.encryptiing

fun main() {
    val input = "Hello Sasha"
    val encrypter = Encrypter()

    val encryptedWord = encrypter.encrypt(input)

    val decrypter = Decrypter()
    val decryptedWord = decrypter.decrypt(encryptedWord)

    println("input=$input decryptedWord=$decryptedWord")

}