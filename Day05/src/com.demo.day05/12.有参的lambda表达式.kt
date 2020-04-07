package com.demo.day05

/**
 * @author bian
 * @since 1.0
 * 2020/1/23
 */
fun main(args: Array<String>) {
    //嵌套有参数的lambda表达式
    {a:Int,b:Int->
        a+b
    }.invoke(10,20)

    fun add(a:Int, b:Int):Int = a + b
}