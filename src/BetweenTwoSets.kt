/*
 * Complete the 'getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    // Write your code here
    val maxA = a.last()
    val minB = b.first()

    var counter = 0

    for (i in maxA..minB) {
        var isFactorA = true
        for (j in a) {
            if (i % j != 0) {
                isFactorA = false
                break
            }
        }
        if (!isFactorA) continue
        for (k in b) {
            if (k % i != 0) {
                isFactorA = false
                break
            }
        }

        if (isFactorA) {
            counter++
        }
    }

    return counter
}

fun main(args: Array<String>) {
    val firstMultipleInput = readln().trimEnd().split(" ")

    val n = firstMultipleInput[0].toInt()

    val m = firstMultipleInput[1].toInt()

    val arr = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val brr = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}
