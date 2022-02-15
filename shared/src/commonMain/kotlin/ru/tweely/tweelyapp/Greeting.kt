package ru.tweely.tweelyapp

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}