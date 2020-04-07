package com.demo.day04

/**
 * @author bian
 * @since 1.0
 * 2020/1/23
 */
fun main(args: Array<String>) {
    val news = News("标题","简介","路径","内容")
    news.title
    news.desc

    news.component1()//第一个元素
    news.component2()//第二个元素

    //解构
    val(title,desc,imgPath,content) = News("标题","简介","路径","内容")
    println(title)
    println(desc)
}
/**
 * 构造函数
 * get set
 * toString
 * hashCode
 * equeals
 * 参数
 * copy
 */
data class News(var title:String, var desc:String, var imgPath:String,var content:String)

data class Persons(var title:String, var desc:String, var imgPath:String,var content:String)
