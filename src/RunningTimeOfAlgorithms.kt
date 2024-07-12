/*
 * Complete the 'runningTime' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun runningTime(arr: Array<Int>): Int {
    // Write your code here
    var counter = 0

    for (i in 1..<arr.size) {
        for (j in i downTo 1) {
            if (arr[j] < arr[j - 1]) {
                val temp = arr[j]
                arr[j] = arr[j - 1]
                arr[j - 1] = temp
                counter++
            }
        }
    }

    return counter
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val arr = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = runningTime(arr)

    println(result)
}
