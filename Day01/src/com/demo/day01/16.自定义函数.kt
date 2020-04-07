package com.demo.day01

/**
 * @author bian
 * @since 1.0
 * 2020-01-21
 */
fun main(args: Array<String>) {
    sayHello("z")
    print(getLength("zhagn"))
}
fun sayHello() {
    println("hello")
}
fun sayHello(name:String){
    println("hello" + name)
}

fun getLength(string:String):Int{
    return string.length
}