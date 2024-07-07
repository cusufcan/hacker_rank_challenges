/*
 * Complete the 'breakingRecords' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY scores as parameter.
 */

fun breakingRecords(scores: Array<Int>): Array<Int> {
    // Write your code here
    var max = scores[0]
    var min = scores[0]

    var maxCount = 0
    var minCount = 0

    for (i in scores) {
        if (i > max) {
            max = i
            maxCount++
        }

        if (i < min) {
            min = i
            minCount++
        }
    }

    return arrayOf(maxCount, minCount)
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val scores = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
