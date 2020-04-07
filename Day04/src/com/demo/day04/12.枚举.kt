package com.demo.day04

/**
 * @author bian
 * @since 1.0
 * 2020/1/23
 */
//枚举封装 数据  数据是确定的
fun main(args: Array<String>) {
    println(WEEK.星期一)

    //找到枚举里所有元素
    val values = WEEK.values()
    values.forEach {
        println(it)
    }
    println(todo(WEEK.星期二))
}

fun todo(week: WEEK) {
    when(week) {
        in WEEK.星期一..WEEK.星期五 -> println("上班")
//        WEEK.星期二-> println("上班")
//        WEEK.星期三-> println("上班")
//        WEEK.星期四-> println("上班")
//        WEEK.星期五-> println("上班")
        WEEK.星期六 -> println("加班")
        WEEK.星期日 -> println("休息")
    }
}


enum class WEEK{
    星期一,
    星期二,
    星期三,
    星期四,
    星期五,
    星期六,
    星期日
}