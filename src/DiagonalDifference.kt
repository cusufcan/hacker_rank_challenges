import kotlin.math.abs

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var sum1 = 0
    var sum2 = 0
    for (i in arr.indices) {
        sum1 += arr[i][i]
        sum2 += arr[i][arr.size - 1 - i]
    }
    return abs(sum1 - sum2)
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val arr = Array(n) { Array(n) { 0 } }

    for (i in 0..<n) {
        arr[i] = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
