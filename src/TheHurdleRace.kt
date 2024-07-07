/*
 * Complete the 'hurdleRace' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER k
 *  2. INTEGER_ARRAY height
 */

fun hurdleRace(k: Int, height: Array<Int>): Int {
    // Write your code here
    var max = height[0]

    for (i in height.indices) {
        if (height[i] > max) max = height[i]
    }

    return if (max > k) max - k else 0
}

fun main(args: Array<String>) {
    val firstMultipleInput = readln().trimEnd().split(" ")

    val n = firstMultipleInput[0].toInt()

    val k = firstMultipleInput[1].toInt()

    val height = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = hurdleRace(k, height)

    println(result)
}
