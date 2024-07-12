import kotlin.math.abs

/*
 * Complete the 'theLoveLetterMystery' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING s as parameter.
 */

fun theLoveLetterMystery(s: String): Int {
    // Write your code here
    var count = 0

    for (i in 0..<s.length / 2) {
        count += abs(s[i].code - s[s.length - i - 1].code)
    }

    return count
}

fun main(args: Array<String>) {
    val q = readln().trim().toInt()

    for (qItr in 1..q) {
        val s = readln()

        val result = theLoveLetterMystery(s)

        println(result)
    }
}
