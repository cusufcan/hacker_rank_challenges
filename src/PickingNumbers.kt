/*
 * Complete the 'pickingNumbers' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun pickingNumbers(a: Array<Int>): Int {
    // Write your code here
    var maxSize = 0

    for (i in a.indices) {
        var count = 0

        for (j in a.indices) {
            if (a[j] == a[i] || a[j] == a[i] + 1) count++
        }

        if (count > maxSize) maxSize = count
    }

    return maxSize
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val a = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = pickingNumbers(a)

    println(result)
}
