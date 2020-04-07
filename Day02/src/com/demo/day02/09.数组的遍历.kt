/**
 * @author bian
 * @since 1.0
 * 2020-01-21
 */
fun main(args: Array<String>) {
    val array = arrayOf("zhangsan","lisi","wangwu")
    array.forEach {
        println(it)
    }

    array.forEachIndexed { index, s ->
        println("index=$index s=$s")
    }
}
