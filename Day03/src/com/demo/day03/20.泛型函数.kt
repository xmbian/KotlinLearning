package com.demo.day03

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
fun main(args: Array<String>) {
    parseType(10)
}

fun <T>parseType(thing:T){//前 定义泛型 后 使用泛型
    when(thing){
        is Int -> println("Int类型")
        is String -> println("String类型")
        else -> println("不知道具体类型")
    }
}