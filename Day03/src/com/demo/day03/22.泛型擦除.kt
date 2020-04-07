package com.demo.day03

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
fun main(args: Array<String>) {
//    val box1 = Box<String>("")
//    val box2 = Box<Int>(10)
//
//    println(box1.javaClass.name)
//    println(box2.javaClass.name)
    String::class.java
    parseType1(10)
}

//解决泛型擦除 1、reified  2、inline
inline fun <reified T> parseType1(thing:T){
    //获取传递的thing的class类型
    val name = T::class.java.name
    println(name)
}