/*
 * Complete the 'minimumDistances' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun minimumDistances(a: Array<Int>): Int {
    // Write your code here
    var minDistance = Int.MAX_VALUE
    
    for (i in a.indices) {
        for (j in i + 1..<a.size) {
            val distance = j - i
            if (a[i] == a[j] && distance < minDistance) minDistance = distance
        }
    }

    return if (minDistance == Int.MAX_VALUE) -1 else minDistance
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val a = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = minimumDistances(a)

    println(result)
}
