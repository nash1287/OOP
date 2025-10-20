package com.nash12.oop.encryptiing

class Encrypter {
    fun encrypt (input: String): String {

        return input
            .map { char -> dict.get(char) }
            .joinToString("")
    }

}




