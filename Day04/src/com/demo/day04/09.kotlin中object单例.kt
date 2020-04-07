package com.demo.day04

/**
 * @author bian
 * @since 1.0
 * 2020/1/23
 */
fun main(args: Array<String>) {

    Utils.name
    Utils.sayHello()
}

//设置成一个单例
//object单例  所有字段都是static  方法不是
//object单例试用条件：字段不太多  （因为static在初始化的时候加载进内存）
object Utils{
    var name="zhangsan"
    fun sayHello(){
        println("hello")
    }
}