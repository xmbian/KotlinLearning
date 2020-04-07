/**
 * @author bian
 * @since 1.0
 * 2020-01-21
 */
fun main(args: Array<String>) {
    val arr = arrayOf("张三","李四","王五","张三","赵六")
    //查找第一个张三的角标
    //返回第一个元素对应的角标 如果没找到返回 -1
    val index = arr.indexOf("张三")
    println(index)

    //查找最后一个张三的角标
    arr.lastIndexOf("张三")

    //查找第一个姓张的人
    val index3 = arr.indexOfFirst {
        it.startsWith("张")
    }
    println(index3)

    //查找最后一个姓张的人
    val index4 = arr.indexOfLast {
        it.startsWith("张")
    }
    println(index4)


    val index5 = arr.indexOfLast {
        it=="张三"
    }
}