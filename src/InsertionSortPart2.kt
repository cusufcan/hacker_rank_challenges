/*
 * Complete the 'insertionSort2' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER_ARRAY arr
 */

fun insertionSort2(n: Int, arr: Array<Int>): Unit {
    // Write your code here
    for (i in 1..<n) {
        for (j in i downTo 1) {
            if (arr[j] < arr[j - 1]) {
                val temp = arr[j]
                arr[j] = arr[j - 1]
                arr[j - 1] = temp
            }
        }
        println(arr.joinToString(" "))
    }
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val arr = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    insertionSort2(n, arr)
}
