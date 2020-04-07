/**
 * @author bian
 * @since 1.0
 * 2020-01-21
 */
//kotlin种when原理：简单的when是switch实现，复杂的是通过if-else实现
//when的返回值是最后一行
fun main(args: Array<String>) {
    val age = 6
    val todo = todo3(age)
    println(todo)
}

fun todo3(age:Int) :String{
    return when(age){
        7 ->  "开始上小学"
        12 ->{
            println("找到了")
             "开始上小学"
        }
        15 ->{
             "开始上小学"
        }
        18 ->{
             "开始上小学"
        }
        else ->{
             "开始上小学"
        }
    }

}