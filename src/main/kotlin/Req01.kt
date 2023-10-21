fun calculateDiscount(originalPrice: Double): Double {
    val discount = 0.1
    val discountedValue = originalPrice * discount
    return originalPrice - discountedValue
}

fun main() {
    calculateDiscount(100.0)
}
