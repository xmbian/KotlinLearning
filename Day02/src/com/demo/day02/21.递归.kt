package com.demo.day02

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
fun main(args: Array<String>) {
    //阶乘
    val result = fact(5)
    println(result)

    println(fibonacci(8))
}

fun fact(n:Int):Int{
    if (n == 1) {
        return 1
    } else{
        return n * fact(n-1)
    }
}

//斐波那契数列 1 1 2 3 5 8 13 21 34 55
fun fibonacci(n:Int):Int{
    if (n==1 || n == 2) {
        return 1
    } else {
        return fibonacci(n-2) + fibonacci(n-1)
    }
}