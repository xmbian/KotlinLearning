package com.demo.day05

/**
 * @author bian
 * @since 1.0
 * 2020/1/23
 */
fun main(args: Array<String>) {
    //test代表的是lambda表达式的返回值
    //lambda返回不需要return 返回值是最后一行
    val test = {
        println("qq")
        10
    }()
}