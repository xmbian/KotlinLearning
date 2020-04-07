package com.demo.day01

/**
 * @author bian
 * @since 1.0
 * 2020/1/21
 */
fun main(args: Array<String>) {
    var a:Int = 10

    //kotlin是类型安全的语言，类型一旦确定，不再改变
    var b = 10

    var c = "张三"
    var d ='a'

    var e:Byte = 10
    var f:Long = 10L

    /*----String和Int类型的转换----*/
//    toXxx()转换为基本数据类型
    var m =10
    var s = "10"
    println(s.toInt())

    /*int和Long之间的转换*/
    //不同数据类型不能相互赋值
    var u = 10
    var v = 10L
//    u = v
//    v = u
    u= v.toInt()
    v = u.toLong()




}