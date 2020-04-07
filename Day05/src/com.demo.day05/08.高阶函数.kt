package com.demo.day05

/**
 * @author bian
 * @since 1.0
 * 2020/1/23
 */
fun main(args: Array<String>) {
    var a = 10
    var b = 20
    var sum = 0
    var result = 0

    sum = add(a,b)
    result = sub(a,b)

    cacl(a,b,::add)//第三个参数是函数的引用
}

fun cacl(a:Int,b:Int, block:(Int,Int) -> Int):Int{
    val result = block(a, b)
//    val invoke = block.invoke(a, b)
    return result
}

fun add(a:Int,b:Int) = a+b
fun sub(a:Int,b:Int) = a-b