
private val const = "some const"

class Phone {
    private val name: String = "iphone"
    fun move() {}
}

class Database (val phone: Phone) {
    fun loadData() {}
    fun doSomething() {
        phone.uploadToBackend(); // We can access extension here
        phone.downLoadFromBackend()
    }

    fun Phone.uploadToBackend() {
        move()
        loadData()
        downLoadFromBackend()
    }
}

fun Phone.downLoadFromBackend() {

}

fun main(args: Array<String>) {
    val phone = Phone()
//    phone.uploadToBackend() // Compilation error
    phone.downLoadFromBackend()
}