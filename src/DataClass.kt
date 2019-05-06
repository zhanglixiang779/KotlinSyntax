open class Super()

//data class can extend other classes including seald class
data class Dog(val name: String) : Super() {
    var age: Int = 0
}
fun main(args: Array<String>) {
    val dog1 = Dog("John")
    val dog2 = Dog("John")
    dog1.age = 10
    dog2.age = 20
    println("person1 == person2: ${dog1 == dog2}")
    println("person1 with age ${dog1.age}: $dog1")
    println("person2 with age ${dog2.age}: $dog2")
}