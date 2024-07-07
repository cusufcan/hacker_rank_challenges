/*
 * Complete the 'sockMerchant' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER_ARRAY ar
 */

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    // Write your code here
    val socks = ar
    var pairs = 0
    for (i in socks.indices) {
        for (j in socks.indices) {
            if (socks[i] == socks[j] && i != j && socks[i] != -1 && socks[j] != -1) {
                socks[i] = -1
                socks[j] = -1
                pairs++
            }
        }
    }
    return pairs
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val ar = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
