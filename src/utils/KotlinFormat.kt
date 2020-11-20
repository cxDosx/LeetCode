package utils

import node.ListNode


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

fun String.convertToStringList(): List<String> {
    var input = this.trim { it <= ' ' }
    input = input.substring(1, input.length - 1)
    input = input.replace(""""""".toRegex(), "")
    input = input.replace(" ".toRegex(), "")
    if (input.isEmpty()) {
        return ArrayList()
    }

    return input.split(",".toRegex()).toTypedArray().toList()
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

fun String.convertToListNode(): ListNode? {

    // Generate array from the input
    val nodeValues = this.convertToIntArray()

    // Now convert that list into linked list

    // Now convert that list into linked list
    val dummyRoot = ListNode(0)
    var ptr = dummyRoot
    for (item in nodeValues) {
        ptr.next = ListNode(item)
        ptr = ptr.next
    }
    return dummyRoot.next
}

fun ListNode?.print() {
    if (this == null) {
        println("[]")
    }

    val result = StringBuilder()
    var node = this
    while (node != null) {
        result.append(node.`val`).append(", ")
        node = node.next
    }
    println("[" + result.substring(0, result.length - 2) + "]")
}