/*
 * Complete the 'viralAdvertising' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER n as parameter.
 */

fun viralAdvertising(n: Int): Int {
    // Write your code here
    var shared = 5
    var liked = 0

    for (i in 1..n) {
        liked += shared / 2
        shared = (shared / 2) * 3
    }

    return liked
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val result = viralAdvertising(n)

    println(result)
}
