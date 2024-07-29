/*
 * Complete the 'stones' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER a
 *  3. INTEGER b
 */

fun stones(n: Int, a: Int, b: Int): Array<Int> {
    // Write your code here
    val result = mutableSetOf<Int>()
    for (i in 0..<n) {
        result.add(i * a + (n - 1 - i) * b)
    }
    return result.sorted().toTypedArray()
}

fun main(args: Array<String>) {
    val T = readln().trim().toInt()

    for (TItr in 1..T) {
        val n = readln().trim().toInt()

        val a = readln().trim().toInt()

        val b = readln().trim().toInt()

        val result = stones(n, a, b)

        println(result.joinToString(" "))
    }
}
