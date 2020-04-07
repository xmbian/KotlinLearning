package com.demo.day03.hh

/**
 * @author bian
 * @since 1.0
 * 2020/1/22
 */
fun main(args: Array<String>) {
    val list =ArrayList<Apple>()
    setBoxList(list)
}

//fun setBoxList(list: ArrayList<Fruit>){//接收的只能是Fruit， Apple是Fruit的子类，不能接收
fun setBoxList(list: ArrayList<out Fruit>){ // out：接收当前类或其子类  相当于java中的 ? extends // in：接收当前类或其父类  相当于java中的 ? super
    println(list.size)
}

open class Box<T>(var thing:T)

abstract class Thing

abstract class Fruit:Thing()

class Apple:Fruit()

class Orange:Fruit()
