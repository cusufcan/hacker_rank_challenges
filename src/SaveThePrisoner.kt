/*
 * Complete the 'saveThePrisoner' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER m
 *  3. INTEGER s
 */

fun saveThePrisoner(n: Int, m: Int, s: Int): Int {
    // Write your code here
    return (s - 1 + m - 1) % n + 1
}

fun main(args: Array<String>) {
    val t = readln().trim().toInt()

    for (tItr in 1..t) {
        val firstMultipleInput = readln().trimEnd().split(" ")

        val n = firstMultipleInput[0].toInt()

        val m = firstMultipleInput[1].toInt()

        val s = firstMultipleInput[2].toInt()

        val result = saveThePrisoner(n, m, s)

        println(result)
    }
}
