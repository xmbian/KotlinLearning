package com.demo.day02

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
fun main(args: Array<String>) {
    sendRequest("www")
    sendRequest("www","psot")
}

fun sendRequest(path:String, method:String="GET"){
    println("请求路径=${path},method=${method}")
}