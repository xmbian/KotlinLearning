package com.demo.day04

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
//infix：使用条件：1、必须是成员函数或扩展函数（不能是顶层函数）  2、必须只有一个参数  3、参数不能是可变参数或默认参数
fun main(args: Array<String>) {
    val 张三 = Person()
//    张三.sayHelloTo("李四")
    张三 sayHelloTo "李四"

    //自定义操作符
}

class Person{
    infix fun sayHelloTo(name:String){//类里定义，属于成员函数
        println("你好 $name")
    }
}