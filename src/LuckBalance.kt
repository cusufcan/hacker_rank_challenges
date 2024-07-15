/*
 * Complete the 'luckBalance' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER k
 *  2. 2D_INTEGER_ARRAY contests
 */

fun luckBalance(k: Int, contests: Array<Array<Int>>): Int {
    // Write your code here
    val minLoses = contests
        .filter { it[1] == 1 }
        .sortedByDescending { it[0] }
        .drop(k)
        .sumOf { it[0] }

    return contests.sumOf { it[0] } - 2 * minLoses
}

fun main(args: Array<String>) {
    val firstMultipleInput = readln().trimEnd().split(" ")

    val n = firstMultipleInput[0].toInt()

    val k = firstMultipleInput[1].toInt()

    val contests = Array(n) { Array(2) { 0 } }

    for (i in 0..<n) {
        contests[i] = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = luckBalance(k, contests)

    println(result)
}
