package com.demo.day03

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
//kotlin 字段是私有的，会自动生成get和set方法
fun main(args: Array<String>) {
    val person = Person()
    person.name
    person.age
}

class Person{
    var name = "zhangsan"
    var age = 20
}