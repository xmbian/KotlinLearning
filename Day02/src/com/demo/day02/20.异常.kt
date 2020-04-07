package com.demo.day02

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */

//java异常种类：编译时异常  运行时异常
fun main(args: Array<String>) {
    var a=10
    var b = 0

    try {
        a/b
    } catch (e:Exception) {
        print("异常")
    }

    /********************************************/
    //kotlin不检查编译时异常
    //kotlin认为大部分编译时异常是没有必要的（有好有坏）
    val file = File("a.txt")
    val bfr = BufferedReader(FileReader(file))
}