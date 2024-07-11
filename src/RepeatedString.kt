/*
 * Complete the 'repeatedString' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. LONG_INTEGER n
 */

fun repeatedString(s: String, n: Long): Long {
    // Write your code here
    val aCountInString = s.count { it == 'a' }
    val fullRepeats = n / s.length

    val remainder = (n % s.length).toInt()
    val aCountInRemainder = s.substring(0, remainder).count { it == 'a' }

    return aCountInString * fullRepeats + aCountInRemainder
}

fun main(args: Array<String>) {
    val s = readln()

    val n = readln().trim().toLong()

    val result = repeatedString(s, n)

    println(result)
}
