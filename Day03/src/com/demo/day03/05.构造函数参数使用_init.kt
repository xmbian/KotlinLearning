package com.demo.day03.a

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

class Person(name:String,age:Int){//创建时就要修改name和age
    var name:String = ""
    var age:Int = 0
    //构造函数中的代码可以放在init中执行
    init {
        this.name= name
        this.age = age
    }
}
