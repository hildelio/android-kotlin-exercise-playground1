fun calculateAverage(ages: List<Int>): Double {
    return ages.average()
}

fun countPeopleWeightHeight(weights: List<Double>, heights: List<Double>): Int {
    if (weights.size != heights.size) {
        throw IllegalArgumentException("As listas de pesos e alturas devem ter o mesmo tamanho")
    }

    var count = 0
    for (i in weights.indices) {
        if (weights[i] > 90.0 && heights[i] < 1.5) {
            count++
        }
    }
    return count
}

fun calculatePercentageAgeHeight(ages: List<Int>, heights: List<Double>): Int {
    if (ages.size != heights.size) {
        throw IllegalArgumentException("As listas de idades e alturas devem ter o mesmo tamanho")
    }
    val totalPeople = ages.size
    var count = 0

    for (i in ages.indices){
        if (ages[i] in 10..30 && heights[i] > 1.9) {
            count++
        }
    }
    return (count.toDouble() / totalPeople * 100).toInt()
}

fun main() {
    val ages = listOf(25, 30, 35, 40, 45)
    val weights = listOf(80.0, 95.0, 70.0, 100.0, 98.0)
    val heights = listOf(1.95, 1.96, 1.60, 1.96, 1.45)
    calculateAverage(ages)
    countPeopleWeightHeight(weights, heights)
    calculatePercentageAgeHeight(ages, heights)
}