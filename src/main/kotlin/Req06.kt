fun calculateNewSalary(currentSalary: Double): Double {
    return if (currentSalary <= 300.0) {
        currentSalary * 1.5
    } else if (currentSalary > 300 && currentSalary <= 500.0) {
        currentSalary * 1.4
    } else if (currentSalary > 500.0 && currentSalary <= 700.0) {
        currentSalary * 1.3
    } else if (currentSalary > 700.0 && currentSalary <= 800.0) {
        currentSalary * 1.2
    } else if (currentSalary > 800.0 && currentSalary <= 1000.0) {
        currentSalary * 1.1
    } else {
        currentSalary * 1.05
    }
}

fun main() {
    calculateNewSalary(200.0)
    calculateNewSalary(400.0)
    calculateNewSalary(600.0)
    calculateNewSalary(750.0)
    calculateNewSalary(900.0)
    calculateNewSalary(1200.0)
}