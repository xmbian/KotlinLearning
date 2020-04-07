package com.demo.day04.类委托实现二

/**
 * @author bian
 * @since 1.0
 * 2020/1/23
 */
fun main(args: Array<String>) {
    val bigHeadSon = BigHeadSon()
    val smallHeadFater = SmallHeadFater(bigHeadSon)
    //Fater洗碗
    smallHeadFater.wash()
}

interface WashPower{
    fun wash()
}
class SmallHeadSon:WashPower{
    override fun wash() {
        println("小头儿子开始洗碗了")
    }
}

class BigHeadSon:WashPower{
    override fun wash() {
        println("大头儿子开始洗碗了")
    }
}

//将洗碗能力委托给Son
class SmallHeadFater(var washPower: WashPower):WashPower by BigHeadSon()