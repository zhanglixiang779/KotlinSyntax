
class MyCollection {

}

fun myFunction(function: (Int, Int) -> Int) {

}

fun outerFunction(innerFunction: (Int, Int) -> Int): (Int, Int) -> Int {

    val i = 1
    val j = 2
    return { a, b -> a + b }
}

fun tempFunction(i: Int, j: Int): Int {
    return i + j
}

fun main(args: Array<String>) {
    val list: List<Int> = listOf(1, 2, 3, 4)

    val runnable = Runnable { }

    list.filter { it > 0 }
    list.map {  }

//    with()

    runnable.apply {  }

    myFunction { i, j -> i + j }
    myFunction(fun (i, j) = i + j)
    myFunction(::tempFunction)

    val people = listOf(Person("Gavin", 35), Person("Alice", 30))
    val numbers = mapOf(0 to "zero", 1 to "one", 2 to "two", 3 to "three")
    numbers.mapValues {  }

}