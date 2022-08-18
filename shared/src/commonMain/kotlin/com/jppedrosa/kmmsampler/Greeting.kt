package com.jppedrosa.kmmsampler

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}