package com.demo.day03

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
fun main(args: Array<String>) {
    val son = Son()
    println(son.name)
    println(son.age)
    son.horbe()
}

//kotlin的class都是final的不能被继承，要加open
open class Father{
    open var name = "z"
    open var age = 20
    open fun horbe(){
        println("父亲喜欢抽烟")
    }
}

class Son:Father(){
    override var name: String = "zz"
    override var age: Int = 10
    override fun horbe() {
        println("son喜欢看书")
    }
}