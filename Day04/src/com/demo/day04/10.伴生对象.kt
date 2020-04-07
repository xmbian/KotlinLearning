package com.demo.day04.伴生对象

/**
 * @author bian
 * @since 1.0
 * 2020/1/23
 */
fun main(args: Array<String>) {
    //访问age
    val person = Person()
    person.age

    //访问name
    Person.name
}

class Person{
    var age = 10

    companion object{//伴生对象相当于控制属性的静态
        //相当于static name
        var name ="张三"
    }
}