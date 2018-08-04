

open class SuperClass(val name: String) {

}

class DerivedClass : SuperClass(something) {

    companion object {
        const val something: String = "this is a test"
    }
    val something1: String = "this is a test"
}