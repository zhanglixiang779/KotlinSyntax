


fun main(args: Array<String>) {

    val myReadOnlyMap = mapOf("1" to 1, "2" to 2, "3" to 3)
    val myReadWriteMap = hashMapOf("4" to 4, "5" to 5, "6" to 6)


    for (i in 1 until 10) {
        println(i)
    }

    for (element in myReadOnlyMap) {

    }

    for ((key, value) in myReadOnlyMap) {

    }

//    myReadOnlyMap.filter {  }
//    myReadOnlyMap.filterKeys {  }
//    myReadOnlyMap.filterValues {  }
//
//    myReadWriteMap.put()
//
//    myReadWriteMap.forEach()
}