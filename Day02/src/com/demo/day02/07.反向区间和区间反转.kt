/**
 * @author bian
 * @since 1.0
 * 2020-01-21
 */
fun main(args: Array<String>) {
    //反向区间
    val reage = 100 downTo  1
    reage.forEach {
        println(it)
    }

    /********区间反转**********/
    val reage1= 1..100
    val reage2 = reage1.reversed()
    reage2.forEach {
        println(it)
    }

    for (i in reage2 step 2){
        println(i)
    }
}