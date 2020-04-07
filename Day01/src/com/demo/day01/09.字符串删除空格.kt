package com.demo.day01

/**
 * @author bian
 * @since 1.0
 * 2020/1/21
 */
fun main(args: Array<String>) {
    val str = "  zahg  "
    val newStr = str.trim()
    println(newStr)

    /*------------------------------*/
    val str2 = """
        zhang
        li
        wang
    """/*.trimIndent()*/
    println(str2)

    val str3 = """
        |zhang
        |li
        |wang
    """.trimMargin("|")
    println(str3)

    /*--------------字符串比较----------------*/

}