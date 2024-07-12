/*
 * Complete the 'quickSort' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun quickSort(arr: Array<Int>): Array<Int> {
    // Write your code here
    var pivot = arr[0]
    val left = mutableListOf<Int>()
    val right = mutableListOf<Int>()

    for (i in 1..<arr.size) {
        if (arr[i] < pivot) left.add(arr[i])
        else right.add(arr[i])
    }

    return left.toTypedArray() + pivot + right.toTypedArray()
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val arr = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = quickSort(arr)

    println(result.joinToString(" "))
}
