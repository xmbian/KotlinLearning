package com.demo.day02.a

import com.demo.day02.Girl

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
//1、找到对应的函数
//2、函数前加 operator
fun main(args: Array<String>) {
    var a = 2
    var b = 1
    a + b
    a.plus(b)


    val girl1 = com.demo.day02.a.Girl()
    val girl2 = com.demo.day02.a.Girl()
    val girl = girl1 + girl2
    println(girl.name)
    println(girl.age)
}

class Girl{
    operator fun plus(girl: com.demo.day02.a.Girl):com.demo.day02.a.Girl{
        return this
    }
    var name:String = "李四"
    var age:Int = 20
}