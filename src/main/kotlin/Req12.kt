fun multiplyLists(list1: List<Int>, list2: List<Int>, result: MutableList<Int>) {
    if (list1.size != list2.size || list1.size != result.size) {
        throw IllegalArgumentException("As listas devem ter o mesmo tamanho")
    }

    for (i in list1.indices) {
        result[i] = list1[i] * list2[i]
    }
}

fun main() {
    val list1 = List(10) { it + 1}
    val list2 = (10 downTo 1).toList()
    val result = MutableList(list1.size) { 0 }
    multiplyLists(list1, list2, result)
    println(result)
}
