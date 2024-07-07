import kotlin.math.abs

/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arr: Array<Int>): Unit {
    // Write your code here
    var min: Long = arr[0].toLong()
    var max: Long = arr[0].toLong()
    var total: Long = 0

    for (i in arr) {
        if (i <= min) min = i.toLong()
        if (i >= max) max = i.toLong()
        total += i
    }

    println("${abs(total - max)} ${abs(total - min)}")
}

fun main(args: Array<String>) {

    val arr = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}
