fun calculateConsumerPrice(factoryCost: Double): Double {
    return if (factoryCost <= 12000) {
        factoryCost * 1.05
    } else if (factoryCost > 12000 && factoryCost <= 25000) {
        factoryCost * 1.25
    } else {
        factoryCost * 1.35
    }
}

fun main() {
    calculateConsumerPrice(10000.0)
    calculateConsumerPrice(15000.0)
    calculateConsumerPrice(30000.0)
}