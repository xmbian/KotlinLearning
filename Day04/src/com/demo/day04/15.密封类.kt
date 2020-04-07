package com.demo.day04

/**
 * @author bian
 * @since 1.0
 * 2020/1/23
 */
//密封类封装 类型 类型时确定的
fun main(args: Array<String>) {
    val start1 = NedStart.RobStart()
    println(hasRight(start1))

    val start2 = JonSnow()
    println(hasRight(start2))
}

fun hasRight(start:NedStart):Boolean{
    return when(start){
        is NedStart.RobStart-> true
        is NedStart.SansaStart-> true
        is NedStart.AryaStart-> true
        is NedStart.BrandonStart-> true
        else->false
    }
}

sealed class NedStart{
    class RobStart:NedStart()

    class SansaStart:NedStart()

    class AryaStart:NedStart()

    class BrandonStart:NedStart()
}

class JonSnow:NedStart()