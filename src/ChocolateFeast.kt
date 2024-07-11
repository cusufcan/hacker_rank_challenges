/*
 * Complete the 'chocolateFeast' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER c
 *  3. INTEGER m
 */

fun chocolateFeast(n: Int, c: Int, m: Int): Int {
    // Write your code here
    var chocolates = n / c
    var wrappers = chocolates

    while (wrappers >= m) {
        val newChocolatesFromWrappers = wrappers / m
        chocolates += newChocolatesFromWrappers
        wrappers = newChocolatesFromWrappers + (wrappers % m)
    }

    return chocolates
}

fun main(args: Array<String>) {
    val t = readln().trim().toInt()

    for (tItr in 1..t) {
        val firstMultipleInput = readln().trimEnd().split(" ")

        val n = firstMultipleInput[0].toInt()

        val c = firstMultipleInput[1].toInt()

        val m = firstMultipleInput[2].toInt()

        val result = chocolateFeast(n, c, m)

        println(result)
    }
}
