
fun String.upperCaseFirstLetter(): String = this.substring(0, 1).toUpperCase().plus(this.substring(1))

fun calCircumference(radius: Double) = (2 * Math.PI) * radius

fun calArea(radius: Double): Double = (Math.PI) * Math.pow(radius, 2.0)

//Lamda Expression
val calArea1 = { radius: Double -> (Math.PI) * Math.pow(radius, 2.0)}

//Anonymous function
val calArea2 = fun (radius: Double): Double = (Math.PI) * Math.pow(radius, 2.0)

//Extending function type
val calArea3 = object : (Double) -> Double {
    override fun invoke(radius: Double): Double {
        return (Math.PI) * Math.pow(radius, 2.0)
    }
}

fun circleOperation(radius: Double, op: (Double) -> Double): Double {
    val result = op(radius)
    return result
}

fun main(args: Array<String>) {

    circleOperation(3.0, ::calArea)
    circleOperation(3.0, calArea1)
    circleOperation(3.0, calArea2)
    circleOperation(3.0, calArea3)
    println("hello world")
    calArea3.invoke(3.0)
    calArea3(3.0)

    fun foo() {
        ordinaryFunction {
            return // ERROR: can not make `foo` return here
        }
    }

    val map: Map<String, Int> = HashMap()
    val list = listOf(1, 2, 3, 4, 5)

    val higherOrderFunction = HigherOrderFunction()

    val ints = intArrayOf(1, 2, 3, 4, 5)
    ints.filter { it > 3 }

    ints.filter(fun (item) = item > 3)

    list.forEach { it > 2 }

    val funVariable: (Int, Int) -> Int = { x, y -> x + y }

    val value = funVariable(2, 3)

    val sum = fun Int.(other: Int): Int = this + other
    val a = 5
    a.sum(5)

    html { anything() }

    val aaa: (Int, Int) -> Int = label@ { x, y ->


        for (i in 10 downTo 1 step 1) {
            if (i == 2) {
                return@label i
            }
        }

        0
    }

    val myFunction = MyFunction()
    myFunction()

    val getMessage = fun(response: Int): String {
        if(response !in 200..299) {
            return "Error"
        }
        return response.toString()
    }

//    val getMessage1 = { response: Int ->
//        if(response !in 200..299) {
//            return"Error" // Error! Not allowed
//        }
//        response.toString()
//    }

    fun greet(): () -> Unit = fun() { println("Hello") }

}

class HigherOrderFunction {

    fun something(x : Int): Int = x + 2

    fun <T, R> Collection<T>.fold(
            initial: R,
            combine: (acc: R, nextElement: T) -> R
    ): R {
        var accumulator: R = initial
        for (element: T in this) {
            accumulator = combine(accumulator, element)
        }
        return accumulator
    }

    val functionType: (Int, Int) -> Int = { x, y -> x + y}

}

class MyFunction : () -> Unit {
    override fun invoke() {
        println("MyFunction")
    }
}

class HTML {
    fun body(x: Int) { println() }
    fun somebody() { println() }
}

fun html(init: HTML.() -> Unit): HTML {
    val html = HTML()  // create the receiver object
    html.init()        // pass the receiver object to the lambda
    return html
}

fun anything() {
    println()
}

inline fun ordinaryFunction(lambda: () -> Unit) {

}

