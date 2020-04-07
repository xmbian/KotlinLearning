package com.demo.day01

/**
 * @author bian
 * @since 1.0
 * 2020/1/21
 */
fun main(args: Array<String>) {
    val place = "江苏省南京市雨花台区"
    println(place)

    val place2 = "江苏省\n南京市\n雨花台区"
    println(place2)

    /*---原样输出--*/
    val place4 = """
        江苏省
        南京市
        雨花台区
    """.trimIndent()
    println(place4)
}