/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here
    var positive = 0
    var negative = 0
    var zero = 0
    val n = arr.size.toDouble()
    for (i in arr) {
        if (i > 0) positive++
        else if (i < 0) negative++
        else zero++
    }
    println(positive / n)
    println(negative / n)
    println(zero / n)
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val arr = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    plusMinus(arr)
}
