package com.demo.day05.lambda去括号

/**
 * @author bian
 * @since 1.0
 * 2020/1/23
 */
fun main(args: Array<String>) {
    var a = 10
    var b = 20
    var sum = 0
    var result = 0

    //匿名函数  即lambda
    //调用的时候最后一个参数是匿名函数lambda表达式
    //如果最后一个参数是lambda表达式时， （）可以前移
    cacl(a,b) { m, n->
        m+n
    }//第三个参数是函数的引用,返回值不用写，会自动推断出

}

//高级函数  第三个参数（最后一个参数）是函数参数
fun cacl(a:Int,b:Int, block:(Int,Int) -> Int):Int{
    val result = block(a, b)
//    val invoke = block.invoke(a, b)
    return result
}
