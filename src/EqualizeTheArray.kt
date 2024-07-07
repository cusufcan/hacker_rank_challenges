/*
 * Complete the 'equalizeArray' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun equalizeArray(arr: Array<Int>): Int {
    // Write your code here
    var maxFreq = 0
    var maxFreqNumber = arr[0]
    var counter = 0

    for (i in arr.indices) {
        var freq = 0
        for (j in arr.indices) {
            if (arr[i] == arr[j]) freq++
        }
        if (freq > maxFreq) {
            maxFreq = freq
            maxFreqNumber = arr[i]
        }
    }

    for (i in arr.indices) {
        if (arr[i] != maxFreqNumber) counter++
    }

    return counter
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val arr = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = equalizeArray(arr)

    println(result)
}
