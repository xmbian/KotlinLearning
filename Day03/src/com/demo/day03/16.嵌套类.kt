package com.demo.day03

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
//嵌套类属于static类 和外部类没有关系
fun main(args: Array<String>) {
    //创建嵌套类
    val inClass =  OutClass.InnerClass()
    inClass.sayHello()
}

class OutClass{
    var name = "张三"
    class InnerClass{
        fun sayHello(){
            println("内部类")
        }
    }
}
