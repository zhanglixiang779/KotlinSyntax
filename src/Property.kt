
class MyProperty {

    lateinit var hello: String
//    lateinit var hello2: String?
//    lateinit var hello3: Int
//    lateinit val hello4: String

    val myPropertyClassJava = MyProperty::class.java
    val myPropertyClassKotlin = MyProperty::class

    private var _table: Map<String, Int>? = null
    public val table: Map<String, Int>
        get() {
            if (_table == null) {
                _table = HashMap() // Type parameters are inferred
            }
            return _table ?: throw AssertionError("Set to null by another thread")
        }

    val something: String
        get() {
            return ""
        }

    var somethingElse: String = "init value"
        get() {
            field = "something else"
            return "something awesome"
        }
        set(value) {
//            setDataFromString(value)
        }

    private fun setDataFromString(value: String) {

    }
}

fun main(args: Array<String>) {

}