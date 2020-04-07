package com.demo.day04.惰性加载

/**
 * @author bian
 * @since 1.0
 * 2020/1/23
 */
//字段 val  不可变 by lazy修饰确定的值
//by lazy 放在成员变量中 可以单独存在
//by lazy 返回值是最后一行
//by lazy 是线程安全的
val name1:String by lazy {
    println("初始化了一次")
    "张三"
}
fun main(args: Array<String>) {
    println(name1)
    println(name1)
}

/*
class Person{
    val name1:String by lazy {  "张三" }
//    val name2:String = "张三"
//    val name3:String = "张三"
//    val name4:String = "张三"
}*/
