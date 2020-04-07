package com.demo.day04

/**
 * @author bian
 * @since 1.0
 * 2020/1/23
 */
fun main(args: Array<String>) {
    val str:String? = null/*"张三"*/
    val myIsEmpty = str.myIsEmpty()
    println(myIsEmpty)

    val son = Son()
    son.sayHello()
}

/**
 * 1、String类扩展 fun String.扩展函数名
 * 2、扩展函数可以访问当前对象里面的字段和方法
 */
fun String?.myIsEmpty():Boolean{
    return this == null ||this.length == 0
}

fun Father.sayHello(){
    println("hello")
}

open class Father{
    fun ha(){
        println("haha")
    }
}

class Son:Father()