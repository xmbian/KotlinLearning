package com.demo.day05.lambda

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
    cacl(a,b,{m,n->
        m+n //相当于   return m+n
    })//第三个参数是函数的引用,返回值不用写，会自动推断出

}

//高级函数
fun cacl(a:Int,b:Int, block:(Int,Int) -> Int):Int{
    val result = block(a, b)
//    val invoke = block.invoke(a, b)
    return result
}
