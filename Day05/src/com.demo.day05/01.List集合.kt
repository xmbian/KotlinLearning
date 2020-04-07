package com.demo.day05

import java.util.*
import kotlin.collections.ArrayList

/**
 * @author bian
 * @since 1.0
 * 2020/1/23
 */
fun main(args: Array<String>) {
    //不能添加、修改元素
    val list1 = listOf("张三", "李四","王五")
    list1.forEach {
        println(it)
    }

    //返回的是ArrayList集合
    val list2 = mutableListOf("张三", "李四", "王五")
    //修改
    list2.set(0,"赵六")
    list2.add(1,"ss")
    list2.forEach {
        println(it)
    }

    /********************** java ******************************/
    val arrayListOf = arrayListOf("", "", "")

    val arrayList = ArrayList<String>()

    val vector = Vector<String>()
}