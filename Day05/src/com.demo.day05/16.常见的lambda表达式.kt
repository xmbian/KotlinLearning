package com.demo.day05

/**
 * @author bian
 * @since 1.0
 * 2020/1/23
 */
fun main(args: Array<String>) {
    val str = "张三"
    str.forEach (
//        ::myPrint
        ::println
        )

    str.forEach({char->
    println(char)})


    val arrayOf = arrayOf("张三", "李四")
    val index = arrayOf.indexOfFirst ({
      it.startsWith("四")
    })


}

fun myPrint(char: Char){
    println(char)
}