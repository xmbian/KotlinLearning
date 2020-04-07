/**
 * @author bian
 * @since 1.0
 * 2020-01-21
 */
fun main(args: Array<String>) {
//    1 until 100 [0,100)

    val range1 = 1..100
    val range2 = IntRange(1,100)
    val range3 = 1.rangeTo(100)

    /**************/
    val range4 = 1L..100L
    val range5 = LongRange(1L,100L)
    val range6 = 1L.rangeTo(100L)

    /**************/
    val range7 = 'a'..'z'
    val range8 = CharRange('a','z')
    val range9 = 'a'.rangeTo('z')
}