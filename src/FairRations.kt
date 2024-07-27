/*
 * Complete the 'fairRations' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts INTEGER_ARRAY B as parameter.
 */

fun fairRations(B: Array<Int>): String {
    // Write your code here
    var count = 0
    for (i in 0..<B.size - 1) {
        if (B[i] % 2 == 0) continue
        B[i]++
        B[i + 1]++
        count += 2
    }
    return if (B[B.size - 1] % 2 == 0) count.toString()
    else "NO"
}

fun main(args: Array<String>) {
    val N = readln().trim().toInt()

    val B = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = fairRations(B)

    println(result)
}