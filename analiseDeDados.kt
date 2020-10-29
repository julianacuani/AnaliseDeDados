fun main(args: Array<String>) {
    val data = mapOf(
        "users1.csv" to listOf(32, 45, 17, -1, 34),
        "users2.csv" to listOf(19,-1, 67, 22),
        "users3.csv" to listOf(),
        "users4.csv" to listOf(56, 32, 18, 44)
    )

    val idadeMedia =  data.flatMap { it.value }
        .filter { it > 0}
        .average()

    val dadosIncompletos = data.filter { it.value.any{ it < 0} }
        .map { it.key }

    val qteDadosIncompletos = data.flatMap { it.value }
        .filter { it < 0 }
        .count()
}