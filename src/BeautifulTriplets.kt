/*
 * Complete the 'beautifulTriplets' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER d
 *  2. INTEGER_ARRAY arr
 */

fun beautifulTriplets(d: Int, arr: Array<Int>): Int {
    // Write your code here
    var count = 0

    for (i in arr.indices) {
        if (arr.contains(arr[i] + d) && arr.contains(arr[i] + 2 * d)) count++
    }

    return count
}

fun main(args: Array<String>) {
    val firstMultipleInput = readln().trimEnd().split(" ")

    val n = firstMultipleInput[0].toInt()

    val d = firstMultipleInput[1].toInt()

    val arr = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = beautifulTriplets(d, arr)

    println(result)
}
