package com.demo.day02

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
fun main(args: Array<String>) {
    var a=10
    var b= 20
    println(add(a, b,1))
}

fun add(vararg a:Int):Int{
    //a是什么类型？   数组
    val newa = a
    var result = 0
    a.forEach {
        result += it
    }
    return result
}