


val getMessage = fun(myInt: Int): String {
    if(myInt !in 200..299) {
        return "Error"
    }
    return myInt.toString()
}

val getMessage2 = lambda@ { myInt: Int ->
    if(myInt !in 200..299) {
        return@lambda "Error"
    }
    myInt.toString()
}

fun main(args: Array<String>) {

}