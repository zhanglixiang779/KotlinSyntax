import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

enum class IntArithmetics : BinaryOperator<Int>, IntBinaryOperator {
    PLUS {
        override fun apply(t: Int, u: Int): Int = t + u
    },
    TIMES {
        override fun apply(t: Int, u: Int): Int = t * u
    };

    override fun applyAsInt(t: Int, u: Int) = apply(t, u)
}

enum class CustomColor() {
    GREEN, RED, PURPLE, YELLOW
}

fun main(args: Array<String>) {
    val a = 13
    val b = 31
    for (f in IntArithmetics.values()) {
        println("$f($a, $b) = ${f.apply(a, b)}")
    }

    val plusName = IntArithmetics.PLUS.name
    val plusPosition = IntArithmetics.PLUS.ordinal
    println(IntArithmetics.PLUS.name)
    println(IntArithmetics.PLUS.ordinal)
    println(IntArithmetics.TIMES.name)
    println(IntArithmetics.TIMES.ordinal)

    for (enum in IntArithmetics.values()) {
        println(enum)
    }

    println(IntArithmetics.valueOf("PLUS"))
    println(IntArithmetics.valueOf("TIMES"))
    //Throws an exception
//    println(IntArithmetics.valueOf("ANYTHING"))

    val color: CustomColor = CustomColor.YELLOW
    when(color) {
        CustomColor.GREEN -> println("green")
        CustomColor.RED -> println("red")
        else -> println("purple or yellow")
    }

}