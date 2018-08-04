
fun main(args: Array<String>) {

    val string = "test string"

    run {  }

    with("test") {}

    string.run {  }

    string.let {  }

    string.also {  }

    string.apply {  }



    val original = "abc"

    original.also {
        println("The original String is $it") // "abc"
        it.reversed() // even if we evolve it, it is useless
    }.also {
        println("The reverse String is ${it}") // "abc"
        it.length  // even if we evolve it, it is useless
    }.also {
        println("The length of the String is ${it}") // "abc"
    }
}