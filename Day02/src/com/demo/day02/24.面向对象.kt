package com.demo.day02

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
fun main(args: Array<String>) {
    val girl = Girl()
    girl.name
    girl.age
    girl.greeting()


}

class Rect{
    var long:Int = 100
    var width:Int = 100
}

class Girl{
    //静态属性
    var name:String = "李四"
    var age:Int = 20
    //动态行为
    fun greeting() {
        println("hello")
    }
}