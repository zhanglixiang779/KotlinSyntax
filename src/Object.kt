class Car {

}

interface CarFactory {
    val prize: Int
    fun makeCar(): Car
}

object Fiat126PFactory: CarFactory {
    override val prize: Int = 500
    override fun makeCar(): Car = TODO()
}

object OpelAstraFactory: CarFactory {
    override val prize: Int = 2_500
    override fun makeCar(): Car = TODO()
}

object FerrariFactory: CarFactory {
    override val prize: Int = 500_000
    override fun makeCar(): Car = TODO()
}

val factories = listOf(
        Fiat126PFactory,
        OpelAstraFactory,
        FerrariFactory
)
val cheapestCar = factories.minBy { it.prize }?.makeCar()

val someObject = object {
    val a: Int = 1
}

class TopLevelClass {


    companion object  {
        fun doSomeStuff() {

        }
    }

    object FakeCompanion {
        fun doOtherStuff() {
            doSomeStuff()
        }
    }

    fun test() {
        doSomeStuff()
        Companion.doSomeStuff()
        FakeCompanion.doOtherStuff()
    }
}

fun testCompanion() {
    TopLevelClass.doSomeStuff()
    TopLevelClass.Companion.doSomeStuff()
    TopLevelClass.FakeCompanion.doOtherStuff()
}

class MyObject {

    companion object

    fun useCompanionExtension() {
        someExtension()
    }

}

fun MyObject.Companion.someExtension() {}

fun main(args: Array<String>) {
    TopLevelClass().test()
    TopLevelClass.doSomeStuff()
}