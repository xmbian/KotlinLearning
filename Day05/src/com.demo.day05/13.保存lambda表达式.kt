package com.demo.day05

/**
 * @author bian
 * @since 1.0
 * 2020/1/23
 */
fun main(args: Array<String>) {

    val blockl:(()->Unit)?=null//可空的函数变量类型
    blockl?.invoke()

    //保存lambda表达式
    val block=
            {
                println("hello")
            }
    //调用lambda表达式
    block()
}