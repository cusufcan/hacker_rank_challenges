/*
 * Complete the 'workbook' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER k
 *  3. INTEGER_ARRAY arr
 */

fun workbook(n: Int, k: Int, arr: Array<Int>): Int {
    // Write your code here
    var specialProblems = 0
    var page = 1

    for (i in 0..<n) {
        val problems = arr[i]
        var problemOnPage = 0

        for (j in 1..problems) {
            if (j == page) specialProblems++
            problemOnPage++
            if (problemOnPage == k || j == problems) {
                page++
                problemOnPage = 0
            }
        }
    }

    return specialProblems
}

fun main(args: Array<String>) {
    val firstMultipleInput = readln().trimEnd().split(" ")

    val n = firstMultipleInput[0].toInt()

    val k = firstMultipleInput[1].toInt()

    val arr = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = workbook(n, k, arr)

    println(result)
}
