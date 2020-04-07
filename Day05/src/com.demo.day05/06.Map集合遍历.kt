package com.demo.day05

import java.util.*

/**
 * @author bian
 * @since 1.0
 * 2020/1/23
 */
fun main(args: Array<String>) {

    val map = mapOf("中国" to "China", "英国" to "England")

    val keySet = map.keys

    //key
    keySet.forEach {
        println(it)
    }
    //value
    val values = map.values
    values.forEach {
        println(it)
    }
    //key和value
    map.forEach { t, u ->
        println("key=$t value=$u")
    }

    for ((key,value) in map) {
        println("key=$key value=$value")
    }

}