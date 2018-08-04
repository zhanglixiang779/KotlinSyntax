
class Interops {

    val list = listOf<String>("a", "b")

    val isEmptyStringList: List<String>.() -> Boolean = List<String>::isEmpty

    fun helloWorld(string: String) {

    }
}

class Interops2 {
    companion object {
        fun helloWorld(string: String) {

        }
    }
}

fun helloWorld(string: String) {

}

fun main(args: Array<String>) {
    ObjectTest().setOnClickCallback { println("a test") }
    ObjectTest().setOnClickCallback(Callback { print("sgd") })
    ObjectTest().setOnClickCallback(::helloWorld)
    ObjectTest().setOnClickCallback(Interops()::helloWorld)
    ObjectTest().setOnClickCallback(Interops2.Companion::helloWorld)
}