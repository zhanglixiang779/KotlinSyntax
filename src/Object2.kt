open class MyCustomClass {

    fun first() {

    }

    fun second() {

    }
}

class TestClass() {
    companion object : MyCustomClass() {
        fun third() {

        }
    }

    fun doSomethingInteresting() {
        first()
        second()
        third()
    }
}