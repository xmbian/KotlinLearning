package com.demo.day03

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
//kotlin 字段是私有的，会自动生成get和set方法
fun main(args: Array<String>) {
    val person = Person2()
    person.name
    person.age=900
    println(person.age)
}

class Person2{
    var name = "zhangsan"//只能访问不能修改
    private set//私有set()方法
    var age = 20
    set(value) {
        if (value<150){
//            this.age= value//递归，易栈内存溢出
            field= value
        }
    }
}