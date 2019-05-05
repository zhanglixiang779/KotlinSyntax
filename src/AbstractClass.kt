abstract class AbstractClass {

    abstract fun abstractFunction()

    //open by default for interface, but final by default for abstract class
    open fun nonAbstractFunction() {

    }
}

class Derived : AbstractClass() {
    override fun abstractFunction() {

    }

    override fun nonAbstractFunction() {

    }

}