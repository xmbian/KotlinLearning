package com.demo.day04.延迟加载


/**
 * @author bian
 * @since 1.0
 * 2020/1/23
 */
//lateinit:延迟加载 用的时候再赋值， 不赋值不能用
fun main(args: Array<String>) {
//    println(name)
//    println(name)
}

class Person{
    //不确定 后面用的时候再赋值 ， 且不知道具体是何值
    private lateinit var name:String
    fun setName(name:String){
        this.name = name
    }
}

/* *
 *  1、by lazy 和 lateinit 都可以单独使用或放到成员变量中使用
 *  2、by lazy 知道具体值，只是用的时候再加载
 *  3、lateinit 不知道具体值  后面再赋值
 *  4、by lazy 变量必须通过val修饰 lateinit需要通过var修饰
 */