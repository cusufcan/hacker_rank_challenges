/*
 * Complete the 'findDigits' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER n as parameter.
 */

fun findDigits(n: Int): Int {
    // Write your code here
    var count = 0
    var num = n

    while (num > 0) {
        val digit = num % 10
        if (digit != 0 && n % digit == 0) count++
        num /= 10
    }

    return count
}

fun main(args: Array<String>) {
    val t = readln().trim().toInt()

    for (tItr in 1..t) {
        val n = readln().trim().toInt()

        val result = findDigits(n)

        println(result)
    }
}
