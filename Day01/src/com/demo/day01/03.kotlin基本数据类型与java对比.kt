package com.demo.day01

/**
 * @author bian
 * @since 1.0
 * 2020/1/21
 */
fun main(args: Array<String>) {
    var a:Int = 10
    var b:Int = a+10
    //调用hashcode
    val hashCode:Int = a.hashCode()

    println(hashCode)
}