/*
 * Complete the 'kangaroo' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. INTEGER x1
 *  2. INTEGER v1
 *  3. INTEGER x2
 *  4. INTEGER v2
 */

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    // Write your code here
    var k1 = x1
    var k2 = x2

    val isK1big = k1 > k2

    if (k1 > k2 && v1 >= v2 || k2 > k1 && v2 >= v1) return "NO"

    while (true) {
        k1 += v1
        k2 += v2

        if (k1 == k2) return "YES"

        if (isK1big && k2 > k1 || !isK1big && k1 > k2) return "NO"
    }
}

fun main(args: Array<String>) {
    val firstMultipleInput = readln().trimEnd().split(" ")

    val x1 = firstMultipleInput[0].toInt()

    val v1 = firstMultipleInput[1].toInt()

    val x2 = firstMultipleInput[2].toInt()

    val v2 = firstMultipleInput[3].toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}
