package com.demo.day02

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
//尾递归：函数在调用自己之后没有执行其他任何操作   原理：将递归转化为迭代
//1、将递归转化为尾递归
//2、加上 tailrec 关键字
fun main(args: Array<String>) {
    println(sum22(100000000))
}

tailrec fun sum22(n:Int,result:Int = 0):Int{
    if (n == 1){
        return result + 1
    } else{
        return sum22(n-1,result + n)//尾递归
    }
}

/*//递归
fun sum22(n:Int,result:Int = 0):Int{
    if (n == 1){
        return result + 1
    } else{
        return sum22(n-1,result + n)//尾递归
    }
}*/

/*
//递归
fun sum22(n:Int):Int{
    if (n == 1){
        return 1
    } else{
        return n + sum22(n-1)//调用自己后执行了其他操作
    }
}*/

