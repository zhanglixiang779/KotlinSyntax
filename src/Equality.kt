
class Computer(val name: String, val year: String) {
    override fun equals(other: Any?): Boolean {
        if (other is Computer) {
            return name == other.name && year == other.year
        }

        return false
    }

//    override fun hashCode(): Int {
//        var result = name.hashCode()
//        result = 31 * result + year.hashCode()
//        return result
//    }
}

fun main(args: Array<String>) {
    val computer1 = Computer("Mac", "2018")
    val computer2 = Computer("Windows", "2019")
    val computer3 = Computer("Mac", "2018")

    println(computer1 == computer2)
    println(computer1 == computer3)
}