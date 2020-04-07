package com.demo.day04

/**
 * @author bian
 * @since 1.0
 * 2020/1/23
 */
fun main(args: Array<String>) {
    val smallHeadFater = SmallHeadFater()
    //Fater洗碗
    smallHeadFater.wash()
}

interface WashPower{
    fun wash()
}

class BigHeadSon:WashPower{
    override fun wash() {
        println("小头儿子开始洗碗了")
    }
}

//将洗碗能力委托给Son
class SmallHeadFater:WashPower by BigHeadSon()