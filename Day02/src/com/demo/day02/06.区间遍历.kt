/**
 * @author bian
 * @since 1.0
 * 2020-01-21
 */
fun main(args: Array<String>) {
    val reage = 1..100
    for (i in reage){
        println(i)
    }

    for ((index, i) in reage.withIndex()){
        println("index=$index i=$i")
    }

    reage.forEach{
        println(it)
    }
    
    reage.forEachIndexed { index, i ->
        println("index=$index i=$i")
    }
}