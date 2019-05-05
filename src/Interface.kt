
interface MyInterface {
    val prop: Int // abstract

    val propertyWithImplementation: String
        get() = "foo"

    //open by default for interface, but final by default for abstract class
    fun foo() {
        println(prop)
        println(propertyWithImplementation)
    }
}

class Child : MyInterface {
    override val prop: Int = 29
    fun get() = propertyWithImplementation
}

fun main(args: Array<String>) {
    val child = Child()
    child.foo()
}