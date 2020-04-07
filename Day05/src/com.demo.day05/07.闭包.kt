package com.demo.day05

/**
 * @author bian
 * @since 1.0
 * 2020/1/23
 */
fun main(args: Array<String>) {
    test()
    test()

    val result = test1()
    result()
    result()
}

//闭包可以让函数携带状态
//函数可以作为方法的返回值  方法可以作为函数的参数
fun test1():()->Unit{
    var a = 10
    return {
        println(a)
        a++
    }
}

//函数不保存状态
fun test(){
    var a = 10
    println(a)
    a++
}