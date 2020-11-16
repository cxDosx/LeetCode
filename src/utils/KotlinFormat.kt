package utils


fun String.convertToIntArray(): IntArray {
    var input = this.trim { it <= ' ' }
    input = input.substring(1, input.length - 1)
    if (input.isEmpty()) {
        return IntArray(0)
    }

    val parts: Array<String> = input.split(",".toRegex()).toTypedArray()
    val output = IntArray(parts.size)
    for (index in parts.indices) {
        val part = parts[index].trim { it <= ' ' }
        output[index] = part.toInt()
    }
    return output
}

/**
 * Input [[1,2,3],[4,5,6],[7,8],[9],[0]]]
 * Output IntArray
 */
fun String.convertToInt2Array(): Array<IntArray> {
    var input = this.trim()
    input = input.substring(1, input.length - 1)
    if (input.isEmpty()) {
        return arrayOf(IntArray(0))
    }

    val parts = input.split("],")
    val partList: ArrayList<IntArray> = ArrayList()
    parts.forEach {
        if (it.substring(it.length - 1) != "]") {
            partList.add(it.plus("]").convertToIntArray())
        } else {
            partList.add(it.convertToIntArray())
        }
    }
    return partList.toTypedArray()
}

fun Array<IntArray>.print() {
    print("[")
    this.forEach {
        print("[")
        it.forEachIndexed { index, value ->
            print(value)
            if (index != it.size - 1) {
                print(",")
            } else {
                print("]")
            }
        }
    }
    println("]")
}

fun IntArray?.print() {
    if (this == null) {
        println("null")
        return
    } else if (this.isEmpty()) {
        println("[]")
        return
    }
    print("[")
    for (i in this.indices) {
        print(this[i])
        if (i == this.size - 1) {
            println("]")
        } else {
            print(", ")
        }
    }
}

fun List<Int>?.print() {
    if (this == null) {
        println("null")
        return
    } else if (this.isEmpty()) {
        println("[]")
        return
    }
    print("[")
    for (i in this.indices) {
        print(this[i])
        if (i == this.size - 1) {
            println("]")
        } else {
            print(", ")
        }
    }
}