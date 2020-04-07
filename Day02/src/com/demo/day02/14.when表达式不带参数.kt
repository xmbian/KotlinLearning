/**
 * @author bian
 * @since 1.0
 * 2020-01-21
 */
//kotlin种when原理：简单的when是switch实现，复杂的是通过if-else实现
fun main(args: Array<String>) {
    val age = 6
    val todo = todo2(age)
    println(todo)
}

fun todo2(age:Int) :String{
    when{
        age == 7->{
            return "开始上小学"
        }
        age == 12->{
            return "开始上小学"
        }
        age == 15->{
            return "开始上小学"
        }
        age == 18->{
            return "开始上小学"
        }
        age in 1..100->{
            return "开始上小学"
        }
        else ->{
            return "开始上小学"
        }
    }
    /*when(age){
//        1,2,3,4,5,6->return "没上学"
        in 1..6->return "没上学"
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
    }*/

}