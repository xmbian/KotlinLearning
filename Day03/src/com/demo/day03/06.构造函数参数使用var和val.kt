package com.demo.day03.b

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
fun main(args: Array<String>) {
//    val person = Person()
    val person = Person("zhang",20)
    person.name
}

class Person(var name:String,var age:Int)//主构函数，参数必须初始化
