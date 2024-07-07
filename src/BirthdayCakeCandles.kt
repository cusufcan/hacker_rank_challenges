/*
 * Complete the 'birthdayCakeCandles' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY candles as parameter.
 */

fun birthdayCakeCandles(candles: Array<Int>): Int {
    // Write your code here
    var max = candles[0]
    var count = 0

    for (i in candles) {
        if (i > max) {
            max = i
            count = 0
        }

        if (i == max) count++
    }

    return count
}

fun main(args: Array<String>) {
    val candlesCount = readln().trim().toInt()

    val candles = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}
