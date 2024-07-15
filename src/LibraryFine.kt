/*
 * Complete the 'libraryFine' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER d1
 *  2. INTEGER m1
 *  3. INTEGER y1
 *  4. INTEGER d2
 *  5. INTEGER m2
 *  6. INTEGER y2
 */

fun libraryFine(d1: Int, m1: Int, y1: Int, d2: Int, m2: Int, y2: Int): Int {
    // Write your code here
    if (y1 > y2) return 10000
    if (y1 == y2 && m1 > m2) return 500 * (m1 - m2)
    if (y1 == y2 && m1 == m2 && d1 > d2) return 15 * (d1 - d2)
    return 0
}

fun main(args: Array<String>) {
    val firstMultipleInput = readln().trimEnd().split(" ")

    val d1 = firstMultipleInput[0].toInt()

    val m1 = firstMultipleInput[1].toInt()

    val y1 = firstMultipleInput[2].toInt()

    val secondMultipleInput = readln().trimEnd().split(" ")

    val d2 = secondMultipleInput[0].toInt()

    val m2 = secondMultipleInput[1].toInt()

    val y2 = secondMultipleInput[2].toInt()

    val result = libraryFine(d1, m1, y1, d2, m2, y2)

    println(result)
}
