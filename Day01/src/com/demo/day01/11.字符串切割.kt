package com.demo.day01

/**
 * @author bian
 * @since 1.0
 * 2020-01-21
 */
fun main(args: Array<String>) {
    val str = "张三.李四-王五"

    val result = str.split(".","-")
    println(result)
}