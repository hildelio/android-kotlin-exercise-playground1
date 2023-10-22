fun calculateSumEven(numbers: List<Int>): Int {
    /*var sum = 0
    for (number in numbers) {
        if (number % 2 == 0) {
            sum += number
        }
    }
    return sum*/
    return numbers.filter { it % 2 == 0 }.sum()
}

fun calculateSumOdd(numbers: List<Int>): Int {
    return numbers.filter { it % 2 != 0 }.sum()
}

fun main() {
    val numbers = List(10){ it + 1 }

    calculateSumEven(numbers)
    calculateSumOdd(numbers)
}