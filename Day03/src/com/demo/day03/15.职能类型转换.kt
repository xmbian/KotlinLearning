package com.demo.day03.cc

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
fun main(args: Array<String>) {
    val shepHerDog:Dog = ShepHerDog()
    val ruralDog = RuralDog()

//    shepHerDog.herdShep()
//    ruralDog.witch()

    //想调用herdShep() 1、判断是否是ShepHerDog 2、转换成ShepHerDog类
    if (shepHerDog is ShepHerDog) {
//        val newDog = shepHerDog as ShepHerDog//as 表强转
//        newDog.herdShep()
        shepHerDog.herdShep()
    }
}

abstract class Dog

class ShepHerDog:Dog(){
    fun herdShep(){
        println("牧羊犬放羊")
    }
}

class RuralDog:Dog(){
    fun witch(){
        println("中华田园犬看家")
    }
}