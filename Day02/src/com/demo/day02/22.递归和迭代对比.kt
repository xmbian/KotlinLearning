package com.demo.day02

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
//常见需求：通过递归和迭代都可解决，复杂问题递归更容易解决
//优缺点：递归 逻辑简单    容易栈内存溢出
//       迭代 内存开销小  需抽象出数学模型
fun main(args: Array<String>) {

    println(sum1(10))

    println(sum2(100000000))
}

//递归
fun sum2(n:Int):Int{
    if (n == 1){
        return 1
    } else{
        return n + sum2(n-1)
    }
}


//1到n的和   迭代
fun sum1(n:Int):Int{
    var result = 0
    var copyN = n//kotlin中参数是固定的，不能修改
    while (copyN>0) {
        result += copyN
        copyN --
    }
    return result
}