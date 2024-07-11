/*
 * Complete the 'serviceLane' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. 2D_INTEGER_ARRAY cases
 */

fun serviceLane(n: Int, cases: Array<Array<Int>>, width: Array<Int>): Array<Int> {
    // Write your code here
    val result = mutableListOf<Int>()
    
    for (i in cases.indices) {
        val start = cases[i][0]
        val end = cases[i][1]
        val min = (start..end).minOfOrNull { width[it] } ?: 0
        result.add(min)
    }

    return result.toTypedArray()
}

fun main(args: Array<String>) {
    val firstMultipleInput = readln().trimEnd().split(" ")

    val n = firstMultipleInput[0].toInt()

    val t = firstMultipleInput[1].toInt()

    val width = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val cases = Array(t) { Array(2) { 0 } }

    for (i in 0..<t) {
        cases[i] = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = serviceLane(n, cases, width)

    println(result.joinToString("\n"))
}
