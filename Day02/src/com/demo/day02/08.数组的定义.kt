import com.sun.xml.internal.fastinfoset.util.StringArray

/**
 * @author bian
 * @since 1.0
 * 2020-01-21
 */
//8种基本数据类型的数组可以通过Array创建或通过自己的数据类型Array创建
//字符串数组只能通过Array创建
fun main(args: Array<String>) {
    val arr = arrayOf("张三","李四","王五")
    val arr1 = arrayOf(10,20,30)
    val arr2 = arrayOf('a','b','c')

    val arr3 = arrayOf("张三", 10, 'a')

    /**********************/
    val arr4 = IntArray(10)//new int[10]
    val arr5 = IntArray(10){
        30//把数组里每一个元素都初始化为30
    }
//    BooleanArray
//    ByteArray

//    StringArray不能用
}