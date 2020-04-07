package com.demo.day01

/**
 * @author bian
 * @since 1.0
 * 2020-01-21
 */
fun main(args: Array<String>) {
    val str1 = "abc"
    val str2 = String(charArrayOf('a','b','c'))
    //比较值
    println(str1.equals(str2))
    println(str1 == str2)
    //比较地址
    println(str1 === str2)
}