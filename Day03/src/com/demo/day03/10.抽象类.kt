package com.demo.day03

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
//抽象类以
fun main(args: Array<String>) {
    val zhHuman = ZhHuman()
    val usHuman = UsHuman()
}
abstract class Human{//抽象类不用open关键字
    abstract var color:String
    abstract var language:String
    abstract fun cat()
}

open class ZhHuman:Human(){
    override var color: String = "黄色"
    override var language: String = "中文"

    override fun cat() {
        println("筷子")
    }
}

class UsHuman:Human(){
    override var color: String = "白色"
    override var language: String = "英文"

    override fun cat() {
        println("刀叉")
    }
}