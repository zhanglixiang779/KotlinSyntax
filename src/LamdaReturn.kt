
fun higherOrderFunction(f: (Int) -> Int) {
    f(2)
}

inline fun inlinedHigherOrderFunction(f: (Int) -> Int) {
    f(2)
}

fun test(): Int {
    inlinedHigherOrderFunction { return 2 }
    return 3
}

fun main(args: Array<String>) {
    println(higherOrderFunction { return@higherOrderFunction 2 })
    println(test())
}