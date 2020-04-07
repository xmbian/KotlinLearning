package com.demo.day01

/**
 * @author bian
 * @since 1.0
 * 2020-01-21
 */
fun main(args: Array<String>) {
    val createDiary = createDiary("ssss")
    println(createDiary)
}
//生成模板
fun createDiary(place:String):String{
    val result="啊啊啊啊啊${place}但是，${place.length}帆帆帆帆,调用函数${sayBaibai()}"
    return result
}
fun sayBaibai():String{
    return "baibai"
}