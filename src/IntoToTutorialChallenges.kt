/*
 * Complete the 'introTutorial' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER V
 *  2. INTEGER_ARRAY arr
 */

fun introTutorial(v: Int, arr: Array<Int>): Int {
    // Write your code here
    for (i in arr.indices) {
        if (arr[i] == v) return i
    }

    return 0
}

fun main(args: Array<String>) {
    val v = readln().trim().toInt()

    val n = readln().trim().toInt()

    val arr = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = introTutorial(v, arr)

    println(result)
}
