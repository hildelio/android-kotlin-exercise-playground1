fun calculateAverage(number1: Double, number2: Double): Double {
    return (number1 + number2) / 2
}

fun calculateDifference(number1: Double, number2: Double): Double {
    return if (number1 > number2) {
        number1 - number2
    } else {
        number2 - number1
    }
}

fun calculateProduct(number1: Double, number2: Double): Double {
    return number1 * number2
}

fun calculateDivision(number1: Double, number2: Double): Double? {
    return if (number2 == 0.0) {
        null
    } else {
        number1 / number2
    }
}

fun main() {
    calculateAverage(10.0, 20.0)
    calculateDifference(20.0, 10.0)
    calculateDifference(20.0, 10.0)
    calculateProduct(5.0, 4.0)
    calculateDivision(10.0, 2.0)
    calculateDivision(10.0, 0.0)
}