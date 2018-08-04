
class Item(val title: String, val url: String) {

    fun someMethod() {

    }
}

fun higherOrderFunctionTest(function: () -> Unit) {

}

val items = arrayListOf(Item("a", "www.test.com"), Item("b", "www.example.com"))

fun main(args: Array<String>) {

    val title: (Item) -> String = Item::title
    val title2: (Item) -> String = { it.title }

    val prop: () -> Int = "abc"::length
    val prop2: (String) -> Int =  String::length

    val someMethod: (Item) -> Unit =  Item::someMethod
    val someMethod2: () -> Unit =  Item("d", "www.kotlin.com")::someMethod

    items.sortBy(Item::title)
    items.sortBy { it.title }

    higherOrderFunctionTest(Item("c", "www.google.com")::someMethod)

    println(Item("c", "www.google.com")::title.get())



    val numberRegex = "\\d+".toRegex()
    val boundMatches: (CharSequence) -> Boolean = numberRegex::matches
    val unboundMatches: (Regex, CharSequence) -> Boolean = Regex::matches
    println(numberRegex.matches("29"))

    println(boundMatches("29"))
    println(unboundMatches("\\d+".toRegex(), "29"))

    println(numberRegex::matches)
    println(Regex::matches)
}