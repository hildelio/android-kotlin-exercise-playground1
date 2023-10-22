fun countNegativeNumbers(numbers: List<Double>): Int {
    return numbers.count { it < 0.0 }
}

fun calculateSumOfPositiveNumbers(numbers: List<Double>): Double {
    return numbers.filter { it > 0 }.sum()
}

fun main() {
    val numbers = listOf(-1.0, 2.0, -3.0, 4.0, -5.0)
    println(countNegativeNumbers(numbers))
    println(calculateSumOfPositiveNumbers(numbers))
}