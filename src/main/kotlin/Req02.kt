fun calculateCommission(salesAmount: Double): Double {
    val commissionPercentage = 0.04
    return salesAmount * commissionPercentage
}

fun calculateFinalSalary(baseSalary: Double, commission: Double): Double {
    return baseSalary + commission
}

fun main() {
    calculateFinalSalary(1000.0, calculateCommission(1000.0))
}