package com.demo.day03

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
//同种功能，不同表现形式
//特点 ：通过父类接收，执行的是子类的方法
fun main(args: Array<String>) {
    val dog:Animal = Dog()
    val cat = Cat()
    dog.call()
}

abstract class Animal{
    var color:String=""
//    abstract fun call()
    open fun call(){
    println("叫")
}
}

class Dog:Animal(){
    override fun call() {
        println("汪汪叫")
    }
}

class Cat:Animal(){
    override fun call() {
        println("喵喵叫")
    }
}