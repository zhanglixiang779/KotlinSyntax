
class CustomReceiver() {

    val something = "something"
    fun someMethod() {

    }
}

fun higherOrderFunctionWithReceiver(customReceiver: CustomReceiver, function: CustomReceiver.(Int) -> String): String {
    return customReceiver.function(3)
}

fun main(args: Array<String>) {
    println(higherOrderFunctionWithReceiver(CustomReceiver()) {
        someMethod()
        "$it $something"
    })
}

fun testMain(args: Array<String>): String {
    println(higherOrderFunctionWithReceiver(CustomReceiver()) {
        someMethod()
        return@higherOrderFunctionWithReceiver "something"
//        //throw errors
//        return "something"
    })

    return "something else"
}