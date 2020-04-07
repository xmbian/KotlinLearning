package com.demo.day03.jj

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
fun main(args: Array<String>) {
    val list = ArrayList<String>()
    setBoxList(list)
}

fun setBoxList(list: ArrayList<*>){//* : 接收任意类型，同java中 ?
    println(list.size)
}