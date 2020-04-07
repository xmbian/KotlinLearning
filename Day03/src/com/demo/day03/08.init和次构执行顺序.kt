package com.demo.day03.d

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
fun main(args: Array<String>) {
    val person = Person("张三",20, "138")
}
class Person(var name:String, var age:Int){
    init {
        println("执行了初始化")
    }
    constructor(name: String,age: Int,phone:String):this(name,age){
        println("执行了次构函数")
    }
}
