/*
 * Complete the 'countingSort' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun countingSort2(arr: Array<Int>): Array<Int> {
    // Write your code here
    val count = IntArray(100)
    for (i in arr) count[i]++

    val result = mutableListOf<Int>()
    for (i in count.indices) {
        for (j in 0..<count[i]) result.add(i)
    }

    return result.toTypedArray()
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val arr = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = countingSort2(arr)

    println(result.joinToString(" "))
}
