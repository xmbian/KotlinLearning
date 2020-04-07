package com.demo.day03

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
fun main(args: Array<String>) {
    var 助教 = Teacher()
    println("${助教.level}  ${助教.salary}")
    val 讲师 = 助教 ++
    println(讲师.level)
    println(讲师.salary)

}
/**
 *
 *
 */

class Teacher{
    var level = 1
    var salary = 6000
    //实现inc()
    operator fun  inc():Teacher{
        this.level ++
        this.salary += 1000
        return this//返回this 表明 讲师 助教 是同一个对象
    }
}
