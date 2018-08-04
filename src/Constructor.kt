

class Student(val name: String, val gender: String, height: Float) {

    val studentHeight = height + 0.0F

    fun printStudent() = println("name is $name, gender is $gender, and height is $studentHeight")

}

class Animal(val name: String) {
    constructor(name: String, gender: String) : this(name) {

    }

}

class Constructors {

    constructor(i: Int) {
        println("Constructor")
    }

    init {
        println("Init block")
    }
}

fun main(args: Array<String>) {
    val student = Student("Gavin", "male", 1.75F)
    val animal = Animal("ss")
    val animal1 = Animal("sss", "male")
//    student.printStudent()
    val constructor = Constructors(1)
}