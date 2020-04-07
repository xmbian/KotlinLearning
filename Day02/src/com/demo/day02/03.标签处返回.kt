/**
 * @author bian
 * @since 1.0
 * 2020-01-21
 */
fun main(args: Array<String>) {
    val str1="abc"
    val str2 = "123"
    str1.forEach {  }
    tag@for (c1 in str1) {
        for (c2 in str2) {
            println("$c1 $c2")
            //b2后不再打印
            if (c1 == 'b'&& c2=='2')
                break@tag
        }
    }

}