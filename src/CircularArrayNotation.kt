/*
 * Complete the 'circularArrayRotation' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER k
 *  3. INTEGER_ARRAY queries
 */

fun circularArrayRotation(a: Array<Int>, k: Int, queries: Array<Int>): Array<Int> {
    // Write your code here
    val n = a.size
    val result = Array(queries.size) { 0 }
    val rotations = k % n
    for (i in queries.indices) {
        val newIndex = (queries[i] - rotations + n) % n
        result[i] = a[newIndex]
    }
    return result
}

fun main(args: Array<String>) {
    val firstMultipleInput = readln().trimEnd().split(" ")

    val n = firstMultipleInput[0].toInt()

    val k = firstMultipleInput[1].toInt()

    val q = firstMultipleInput[2].toInt()

    val a = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val queries = Array(q) { 0 }
    for (i in 0..<q) {
        val queriesItem = readln().trim().toInt()
        queries[i] = queriesItem
    }

    val result = circularArrayRotation(a, k, queries)

    println(result.joinToString("\n"))
}
