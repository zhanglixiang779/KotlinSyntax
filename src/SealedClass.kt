

sealed class SealedClass {
    //sealed class is an abstract class.
//    abstract fun someAbstractFunction()
    fun nonAbstractFunction() {

    }
}

class Derived1 : SealedClass()

class Derived2 : SealedClass()

class Derived3 : SealedClass()

object Derived4 : SealedClass()

class Derived5 : SealedClass()

fun whenStatementFunction(s: SealedClass) {
    when (s) {
        is Derived1 -> {}
        is Derived2 -> {}
        is Derived3 -> {}
        Derived4 -> {}
    }
}

sealed class Expr
data class Const(val number: Double) : Expr()
data class Sum(val e1: Expr, val e2: Expr) : Expr()
object NotANumber : Expr()
//If this was added, when expression below would complain.
//class Test : Expr()

fun eval(expr: Expr): Double = when(expr) {
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN
    // the `else` clause is not required because we've covered all the cases
}
