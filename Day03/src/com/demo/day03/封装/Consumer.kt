package com.demo.day03.封装

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
fun main(args: Array<String>) {
    val machine = WashMachine("海尔",12)
    machine.openDoor()
    println("放入衣服")
    machine.closeDoor()

    machine.mode = 2

    machine.start()
}