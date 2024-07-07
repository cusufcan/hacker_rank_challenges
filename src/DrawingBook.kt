import kotlin.math.min

/*
 * Complete the 'pageCount' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER p
 */

fun pageCount(n: Int, p: Int): Int {
    // Write your code here
    val fromFront = p / 2
    val fromBack = n / 2 - p / 2
    return min(fromFront, fromBack)
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val p = readln().trim().toInt()

    val result = pageCount(n, p)

    println(result)
}
