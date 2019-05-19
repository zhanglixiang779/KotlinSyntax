

data class Point(var x: Int, var y: Int) {
    operator fun plus(point: Point): Point {
        println("plus is called")
        return Point(this.x + point.x, this.y + point.y)
    }

    operator fun plusAssign(point: Point) {
        println("plusAssign is calld")
        this.x = this.x + point.x
        this.y = this.y + point.y
    }
}

class NonDataClassPoint(val x: Int, val y: Int) {
    operator fun component1() = x
    operator fun component2() = y
}

class CustomCollection<K, V> {

    inner class Entry(val key: K, val value: V) {
        operator fun component1() = key
        operator fun component2() = value
    }

    operator fun iterator(): Iterator<Entry> =
            object : Iterator<Entry> {
                override fun hasNext(): Boolean {

                }

                override fun next(): CustomCollection<K, V>.Entry {

                }

            }
}

fun main(args: Array<String>) {
    val point1 = Point(1, 2)
    val point2 = Point(3, 4)
    val nonDataClassPoint = NonDataClassPoint(3, 9)
    point1 += point2
//    print(point1 + point2)
    print(point1)
    val (x, y) = point1
    val (m, n) = nonDataClassPoint
    val customCollection = CustomCollection<String, String>()

    //because CustomCollection has an iterator so it can loop.
    // because custom Entry has component1 and component2, so it can be destructured.
    for ( (key, pair) in customCollection) {

    }
}

