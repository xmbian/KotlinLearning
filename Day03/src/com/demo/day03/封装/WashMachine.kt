package com.demo.day03.封装

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
class WashMachine(var brand:String, var l:Int){
    //保存mode
    var mode = 0
    fun openDoor(){
        println("打开门。。")
    }

    fun closeDoor(){
        println("关门。。")
    }

    fun start(){
        when(mode) {
            0-> println("请选择模式")
            1->{
                println("开始放水")
                println("水满了")
                println("开始洗衣服")
                println("mode为1")
                setMotorSpeed(1000)
                println("洗好了")
            }
            2->{
                println("开始放水")
                println("水满了")
                println("开始洗衣服")
                println("mode为2")
                setMotorSpeed(2000)
                println("洗好了")
            }
            else-> println("mode错误")
        }
    }

    private fun setMotorSpeed(speed:Int){
        println("当前转速为$speed")
    }

    fun selectMode(mode:Int){
        this.mode = mode
    }
}