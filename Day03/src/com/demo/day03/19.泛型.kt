package com.demo.day03

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
fun main(args: Array<String>) {
    val box = Box<String>("张三")//1、定义对象时使用泛型
    println(box.thing)
}

open class Box<T>(var thing:T)//定义泛型和使用泛型

class FruitBox(thing: Fruit):Box<Fruit>(thing)//2、定义子类的时候使用泛型

class SonBox<T>(thing: T):Box<T>(thing)//第一个是泛型声明  后面的是使用  //3、定义子类的时候不知道其具体类型，继续使用泛型

abstract class Fruit

class Apple:Fruit()

class Orange:Fruit()