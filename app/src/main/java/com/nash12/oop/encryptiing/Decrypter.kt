package com.nash12.oop.encryptiing

class Decrypter {

    fun decrypt (encrypted: String): String {
        return encrypted
            .map { char -> dict.entries.first { char == it.value }.key }
            .joinToString("")
    }

}