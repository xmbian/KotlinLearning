package com.demo.day01

/**
 * @author bian
 * @since 1.0
 * 2020-01-21
 */
fun main(args: Array<String>) {
    //10  "10"
    val str: String? = null//可空类型
    //
    str!!.toInt()//（关闭空检查）告诉编译器一定不为空，但可能报错，不建议使用

    str?.toInt()//（空安全调用）同下
//    if (str!=null){
//        str.toInt()
//    } else {
//    return null
//    }

    val b:Int = str?.toInt() ?: -1 //（elvis操作符）同下
//    if (str!=null){
//        str.toInt()
//    } else {
//    return -1
//    }

}