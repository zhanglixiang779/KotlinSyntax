import kotlin.*

fun isOdd(x: Int) = x % 2 != 0

val isOdd1: (Int) -> Boolean = ::isOdd
val isOdd11 = ::isOdd


val isOdd2: (Int) -> Boolean = { it % 2 != 0 }

val isOdd3 = fun (x: Int) = x % 2 != 0

val isEmptyStringList: List<String>.() -> Boolean = List<String>::isEmpty

fun main(args: Array<String>) {

    val numbers = listOf(1, 2, 3)

    val strs = listOf("a", "bc", "def")

    val strLength = { s: String -> s.length }
    val strLength1 = String::length
    println(strs.map(String::length))

    println(numbers.filter(::isOdd))
    println(numbers.filter(isOdd1))

    println(numbers.filter(isOdd2))
    println(numbers.filter { it % 2 != 0 })

    println(numbers.filter(isOdd3))
    println(numbers.filter(fun (x: Int) = x % 2 != 0))
}

private fun updateUI(data: String?) {
//    if(data != null){
//        applyUiChanges(data)
//    }

    data?.let { applyUiChanges(data) }
    data?.let (::applyUiChanges)
}

private fun applyUiChanges(data: String) {
    // Do cool stuff in UI
}