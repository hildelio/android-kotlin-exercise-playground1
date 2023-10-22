fun findMultiplesOf2(numbers: IntArray): List<Int> {
    return numbers.filter { it % 2 == 0 }
}

fun findMultiplesOf3(numbers: IntArray): List<Int> {
    return numbers.filter { it % 3 == 0 }
}

fun findMultiplesOf2And3(numbers: IntArray): List<Int> {
    return numbers.filter { it % 2 == 0 && it % 3 == 0 }
}

fun main() {
    val numbers = (1..15).toList().toIntArray()

    println(findMultiplesOf2(numbers))
    println(findMultiplesOf3(numbers))
    println(findMultiplesOf2And3(numbers))
}
