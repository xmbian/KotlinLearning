package com.demo.day04

/**
 * @author bian
 * @since 1.0
 * 2020/1/23
 */

fun main(args: Array<String>) {
    COLOR.RED.r
    COLOR.BLUE.g
    COLOR.GREEN.b

}

//枚举里可以定义构造函数
enum class COLOR(var r:Int, var g:Int,var b:Int){
    RED(255,0,0),
    BLUE(0,0,255),
    GREEN(0,255,0)
}
