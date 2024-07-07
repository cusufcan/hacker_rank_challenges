/*
 * Complete the 'compareTriplets' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    val size = a.size - 1
    var alice = 0
    var bob = 0

    for (i in 0..size) {
        if (a[i] > b[i]) {
            alice++
        } else if (a[i] < b[i]) {
            bob++
        }
    }

    return arrayOf(alice, bob)
}

fun main(args: Array<String>) {

    val a = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val b = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
