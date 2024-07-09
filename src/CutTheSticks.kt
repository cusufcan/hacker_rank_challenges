/*
 * Complete the 'cutTheSticks' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun cutTheSticks(arr: Array<Int>): Array<Int> {
    // Write your code here
    val result = mutableListOf<Int>()

    arr.sort()
    result.add(arr.size)
    for (i in 1..<arr.size) {
        if (arr[i] != arr[i - 1]) result.add(arr.size - i)
    }

    return result.toTypedArray()
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val arr = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = cutTheSticks(arr)

    println(result.joinToString("\n"))
}
