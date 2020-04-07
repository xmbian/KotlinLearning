package com.demo.day05

import sun.management.Agent
import java.util.*

/**
 * @author bian
 * @since 1.0
 * 2020/1/23
 */
fun main(args: Array<String>) {
    val set1 = setOf("zhangsan", "lisi", "wangwu")

    val set2 = mutableSetOf("zhangsan", "lisi", "wangwu")
    set2.add("zhaoliu")

    /******************** java **********************/
    hashSetOf("")

    val treeSet = TreeSet<String>()
    treeSet.add("a")
    treeSet.add("c")
    treeSet.add("b")
    println(treeSet)


}

class Person(var name:String, var age:String)