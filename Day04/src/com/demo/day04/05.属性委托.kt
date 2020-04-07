package com.demo.day04.属性委托

import kotlin.reflect.KProperty

/**
 * @author bian
 * @since 1.0
 * 2020/1/23
 */
fun main(args: Array<String>) {
    val bigHeadSon = BigHeadSon()
    bigHeadSon.压岁钱 = 100
    println(bigHeadSon.压岁钱)
}
class BigHeadSon{
    var 压岁钱:Int by Mother()
}

class Mother {
    //Son要压岁钱
    operator fun getValue(bigHearSon: BigHeadSon, property: KProperty<*>): Int {
        return 儿子的压岁钱
    }
    //son存压岁钱
    operator fun setValue(bigHearSon: BigHeadSon, property: KProperty<*>, i: Int) {
        儿子的压岁钱 += 50
        自己的小金库 +=i - 50
    }

    var 儿子的压岁钱 = 0
    var 自己的小金库 = 0
}