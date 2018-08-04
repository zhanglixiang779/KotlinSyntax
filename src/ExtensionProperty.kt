
// Cannot use property initializer as it has no backing field
//val String.something = "something"

val String.something
    get() = "something"

