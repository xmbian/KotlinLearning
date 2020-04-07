/**
 * @author bian
 * @since 1.0
 * 2020-01-21
 */
fun main(args: Array<String>) {
    val age = 15
    val todo = todo(age)
    println(todo)
}

fun todo(age:Int) :String{
    when(age){
        7 -> return "开始上小学"
        12 ->{
            return "开始上小学"
        }
        15 ->{
            return "开始上小学"
        }
        18 ->{
            return "开始上小学"
        }
        else ->{
            return "开始上小学"
        }
    }

}