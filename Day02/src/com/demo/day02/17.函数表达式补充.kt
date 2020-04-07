/**
 * @author bian
 * @since 1.0
 * 2020-01-21
 */
fun main(args: Array<String>) {
    val a = 10
    val b = 20
    println(add1(a, b))
    //对象变量
    //函数变量
    val padd = ::add1//::获取add1 函数的引用
    //类似C语言中的函数指针
    //通过padd调用函数
    println(padd(a, b))
    println(padd.invoke(22, 22))//可以处理函数变量为空的情况下调用


    /*****函数变量*******/
    val padd1:(Int,Int)->Int = {a,b->a+b}//匿名函数  lamda
    println(padd1(10, 1))
}
//函数体只有一行
//顶层函数
fun add1(a:Int, b:Int) :Int {
    return a+b
}

