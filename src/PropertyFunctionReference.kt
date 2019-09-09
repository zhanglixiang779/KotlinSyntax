

fun propertyReference() {
    val strs = listOf("a", "bc", "def")
    println(strs.map(String::length))
}

fun topLevelFuntion(x: Int) = x % 2 != 0

class AAA {

    fun memberFunction(x: Int) = x % 2 != 0

}

val topLevelFunctionReference = ::topLevelFuntion

val memberFunctionReference = AAA::memberFunction

val propertyReference = String::length
val boundPropertyReference = "abc"::length

fun testtsetstse() {
    listOf("aaa", "bbb").map(propertyReference)
}

