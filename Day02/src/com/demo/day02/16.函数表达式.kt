/**
 * @author bian
 * @since 1.0
 * 2020-01-21
 */
fun main(args: Array<String>) {
    val a = 10
    val b = 20
    println(add(a, b))

}
//函数体只有一行
//fun add(a:Int, b:Int) :Int {
//    return a+b
//}

//函数体只有一行 可以省略{} 和return
//fun add(a:Int, b:Int) :Int= a+b
fun add(a:Int, b:Int) = a+b

//fun sayHello(){
//    println("qqqqq")
//}
fun sayHello()=println("qqqqq")
