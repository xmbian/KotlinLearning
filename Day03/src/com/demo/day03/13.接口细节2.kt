package com.demo.day03.bb

import com.demo.day03.ZhHuman

/**
 * @author bian
 * @since 1.0
 * 2020/1/2 2
 */
fun main(args: Array<String>) {
    val xiaoming = XiaoMing()
    xiaoming.ride()
    xiaoming.drive()
}

class XiaoMing: ZhHuman(),RideBike,DriverCar{
    override var license: String ="123456"

//    override fun drive() {
//        println("晓明学会了开车")
//    }

    override fun ride() {
        println("晓明学会骑车")
    }

}

interface RideBike{
    fun ride()
}

interface DriverCar{
    var license:String //不能实现
    fun drive() {      //接口中的方法可以实现
        println("晓明学会了开车")
    }
}