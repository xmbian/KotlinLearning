package com.demo.day01

/**
 * @author bian
 * @since 1.0
 * 2020/1/21
 */
const val c:Int = 10//不可改变
fun main(args: Array<String>) {

    //可变变量
    var a:Int = 10
    a = 20
    //不可变变量  运行时 可以通过反射改变
    val b: Int = 10
//    b = 13

    //项目中尽量使用val，其次使用var
}