import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.sqrt

/*
 * Complete the 'squares' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER a
 *  2. INTEGER b
 */

fun squares(a: Int, b: Int): Int {
    // Write your code here
    val sqrtA = ceil(sqrt(a.toDouble()))
    val sqrtB = floor(sqrt(b.toDouble()))
    return (sqrtB - sqrtA + 1).toInt()
}

fun main(args: Array<String>) {
    val q = readln().trim().toInt()

    for (qItr in 1..q) {
        val firstMultipleInput = readln().trimEnd().split(" ")

        val a = firstMultipleInput[0].toInt()

        val b = firstMultipleInput[1].toInt()

        val result = squares(a, b)

        println(result)
    }
}
