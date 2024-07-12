/*
 * Complete the 'hackerrankInString' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun hackerrankInString(s: String): String {
    // Write your code here
    val hackerrank = "hackerrank"
    var index = 0

    for (i in s.indices) {
        if (s[i] == hackerrank[index]) index++
        if (index == hackerrank.length) return "YES"
    }

    return "NO"
}

fun main(args: Array<String>) {
    val q = readln().trim().toInt()

    for (qItr in 1..q) {
        val s = readln()

        val result = hackerrankInString(s)

        println(result)
    }
}
