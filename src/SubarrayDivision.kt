/*
 * Complete the 'birthday' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY s
 *  2. INTEGER d
 *  3. INTEGER m
 */

fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    // Write your code here
    var count = 0

    val size = s.size - m
    for (i in 0..size) {
        var sum = 0

        for (j in i..<i + m) {
            sum += s[j]
        }

        if (sum == d) {
            count++
        }
    }

    return count
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val s = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val firstMultipleInput = readln().trimEnd().split(" ")

    val d = firstMultipleInput[0].toInt()

    val m = firstMultipleInput[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}
