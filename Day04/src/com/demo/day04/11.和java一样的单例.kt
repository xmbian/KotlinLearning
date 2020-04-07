package com.demo.day04.a

/**
 * @author bian
 * @since 1.0
 * 2020/1/23
 */
fun main(args: Array<String>) {
    Utils.instance.age
}

class Utils private constructor(){//第一步：私有构造函数
    var age = 20

    companion object{
        var name = "张三"
        //instance表Utils的实例
        val instance by lazy { Utils() }//惰性加载 只会加载一次  线程安全
    }
}
