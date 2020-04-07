package com.demo.day01

/**
 * @author bian
 * @since 1.0
 * 2020-01-21
 */
fun main(args: Array<String>) {
    val a = 10
    val b = 20
    //找到a和b中最大值
    println(max(a,b))

}

fun max(a:Int, b:Int):Int {
//    if (a>b){
//        return a
//    } else{
//        return b
//    }

//   return if (a>b)
//        return a
//    else
//        return b

    return if (a>b) a else b
}