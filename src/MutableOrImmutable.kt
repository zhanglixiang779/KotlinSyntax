fun main(args: Array<String>) {

    val readOnlyList = listOf(1, 2, 3)
    val readWriteList = arrayListOf(1, 2, 3, 4)
    val readWriteList2 = mutableListOf(1, 2, 3, 4, 5)

    val readOnlyMap = mapOf("foo" to 1, "bar" to 2)
    val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    val readWriteMap2 = mutableMapOf("foo" to 1, "bar" to 2)

    val readOnlySet = setOf(1, 2, 3)
    val readWriteSet = hashSetOf(1, 2, 3, 4)
    val readWriteSet2 = mutableSetOf(1, 2, 3, 4, 5)

    println(readWriteMap["foo"])  // prints "1"
    val snapshot: Map<String, Int> = HashMap(readWriteMap)
}