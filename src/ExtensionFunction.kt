
object MyExtension {
    fun helloWorld() {
        doSomething()
    }
}

fun MyExtension.doSomething() = println("do something")

class MyCompanionClass {

    companion object

    fun someMethod() = "some method"
}

fun MyCompanionClass.someOtherMethod() {

}

fun MyCompanionClass.Companion.someStaticMethod() {

}

fun main(args: Array<String>) {

    MyExtension.helloWorld()

    MyCompanionClass.someStaticMethod()
    MyCompanionClass().someMethod()
    MyCompanionClass().someOtherMethod()
}