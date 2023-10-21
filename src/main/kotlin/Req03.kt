fun calculateYears(birthYear: Int, currentYear: Int): Int {
    return  currentYear - birthYear
}

fun calculateMonths(birthYear: Int, currentYear: Int): Int {
    val years = calculateYears(birthYear, currentYear)
    val monthsOfYear = 12
    return years * monthsOfYear
}

fun calculateDays(birthYear: Int, currentYear: Int): Long {
    val years = calculateYears(birthYear, currentYear)
    val daysOfYear = 365.24242424242425
    return (years * daysOfYear).toLong()
}

fun calculateWeeks(birthYear: Int, currentYear: Int): Long {
    val days = calculateDays(birthYear, currentYear)
    val daysOfWeek = 7
    return days / daysOfWeek
}

fun main() {
    val birthYear = 1990
    val currentYear = 2023

    val years = calculateYears(birthYear, currentYear)
    val months = calculateMonths(birthYear, currentYear)
    val days = calculateDays(birthYear, currentYear)
    val weeks = calculateWeeks(birthYear, currentYear)

    println("Idade em anos: $years")
    println("Idade em meses: $months")
    println("Idade em dias: $days")
    println("Idade em semanas: $weeks")
}
