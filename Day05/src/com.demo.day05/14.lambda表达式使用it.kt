package com.demo.day05

/**
 * @author bian
 * @since 1.0
 * 2020/1/23
 */
fun main(args: Array<String>) {
    val a= 10
    val result = haha(a, {
        it + 1
    })

    println(result)
}
fun haha(a:Int,block:(Int)->Int):Int{
     return block(a)
}

fun padd(a:Int) :Int{
    return a + 10
}