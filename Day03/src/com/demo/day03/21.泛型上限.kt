package com.demo.day03.ff

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
fun main(args: Array<String>) {
    val apple = Apple()
    val fruitBox = FruitBox(apple)
    val thing = Thing()
//    val fruitBox1 = FruitBox(thing)
}

open class Box<T>(var thing:T)

class FruitBox<T:Fruit>(thing: T):Box<T>(thing)

open class Thing


open class Fruit:Thing()

class Apple:Fruit()

class Orange:Fruit()
