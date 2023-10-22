import java.util.*
fun calculateFinalPrice(carValue: Double, installment: Int, surcharges: Array<Double>): Any {
    val result = when (installment) {
        1 -> {
            carValue * 0.8
        }
        in 2..12 -> {
            carValue * (1 + surcharges[0])
        }
        in 13..24 -> {
            carValue * (1 + surcharges[1])
        }
        in 25..36 -> {
            carValue * (1 + surcharges[2])
        }
        in 37..48 -> {
            carValue * (1 + surcharges[3])
        }
        in 49..60 -> {
            carValue * (1 + surcharges[4])
        }
        else -> {
            throw IllegalArgumentException("Quantidade de Parcelas não permitida")
        }
    }
    return String.format(Locale.US, "%.1f", result)
}

fun main() {
    val carValue = 25000.0
    val surcharges = arrayOf(0.06, 0.12, 0.18, 0.24, 0.30)
    println(calculateFinalPrice(carValue, 1, surcharges))
    println(calculateFinalPrice(carValue, 12, surcharges))
    println(calculateFinalPrice(carValue, 24, surcharges))
    println(calculateFinalPrice(carValue, 36, surcharges))
    println(calculateFinalPrice(carValue, 48, surcharges))
    println(calculateFinalPrice(carValue, 60, surcharges))
}