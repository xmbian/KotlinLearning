package com.demo.day03

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

class XiaoMing:ZhHuman(),RideBike,DriverCar{
    override fun drive() {
        println("晓明学会了开车")
    }

    override fun ride() {
        println("晓明学会骑车")
    }

}

interface RideBike{
    fun ride()
}

interface DriverCar{
    fun drive()
}