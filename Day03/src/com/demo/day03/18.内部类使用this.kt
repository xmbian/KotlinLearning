package com.demo.day03.ee

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
//内部类不是静态类，需要依赖外部类
fun main(args: Array<String>) {
    //创建内部类
    val inClass =  OutClass().InnerClass()
    inClass.sayHello()

}

class OutClass{
    var name = "张三"
    inner class InnerClass{
        var name = "李四"
        fun sayHello(){
            println("内部类name=$name")
            println("外部类name=${this@OutClass.name}")
        }
    }
}
