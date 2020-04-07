/**
 * @author bian
 * @since 1.0
 * 2020-01-21
 */
//contiune和break只能用在for循环中，不能用在forEach中
fun main(args: Array<String>) {
    val str = "abcde"

    for (c in str) {
        if (c == 'c'){
            continue
        }
        println(c)
    }

    str.forEach {  }
}