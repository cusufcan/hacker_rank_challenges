import kotlin.math.abs

/*
 * Complete the 'beautifulDays' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER i
 *  2. INTEGER j
 *  3. INTEGER k
 */

fun beautifulDays(i: Int, j: Int, k: Int): Int {
    // Write your code here
    var count = 0
    
    for (idx in i..j) {
        val reversed = idx.toString().reversed().toInt()
        if (abs(idx - reversed) % k == 0) count++
    }

    return count
}

fun main(args: Array<String>) {
    val firstMultipleInput = readln().trimEnd().split(" ")

    val i = firstMultipleInput[0].toInt()

    val j = firstMultipleInput[1].toInt()

    val k = firstMultipleInput[2].toInt()

    val result = beautifulDays(i, j, k)

    println(result)
}
