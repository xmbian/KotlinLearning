/**
 * @author bian
 * @since 1.0
 * 2020-01-21
 */
fun main(args: Array<String>) {
    val str = "abcd"
    /*******for**********/
    for (c in str) {
        println(c)
    }
    for ((index,c) in str.withIndex()) {
        println("index=$index c=$c")
    }

    /****foreach****/
    str.forEach {
        println(it)
    }

    str.forEachIndexed{index, c ->
        println("index=$index c=$c")
    }
}