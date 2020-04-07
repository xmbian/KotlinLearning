package com.demo.day03.c

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
fun main(args: Array<String>) {

}

class Person(var name:String,var age:Int){//主构函数，参数必须初始化
    var phone = ""
    //次构函数
    constructor(name: String,age: Int,phone:String):this(name,age) {//this调用主构函数
        this.phone= phone
    }
}