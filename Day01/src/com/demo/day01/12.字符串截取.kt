package com.demo.day01

/**
 * @author bian
 * @since 1.0
 * 2020-01-21
 */
fun main(args: Array<String>) {
    val path = "/User/yole/kotlin-book/chapter.adoc"
    //获取前6个字符
    println(path.substring(0..5))
    //把第一个r之前的字符截取
    println(path.substringBefore("r"))
    //把最后一个r之前的字符截取
    println(path.substringBeforeLast("r"))
    //把第一个r之后的字符截取
    println(path.substringAfter("r"))
    //把最后一个r之后的字符截取
    println(path.substringAfterLast("r"))
}