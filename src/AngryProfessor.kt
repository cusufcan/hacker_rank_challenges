/*
 * Complete the 'angryProfessor' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. INTEGER k
 *  2. INTEGER_ARRAY a
 */

fun angryProfessor(k: Int, a: Array<Int>): String {
    // Write your code here
    var count = 0

    for (i in a) {
        if (i <= 0) count++
        if (count >= k) return "NO"
    }
    
    return "YES"
}

fun main(args: Array<String>) {
    val t = readln().trim().toInt()

    for (tItr in 1..t) {
        val firstMultipleInput = readln().trimEnd().split(" ")

        val n = firstMultipleInput[0].toInt()

        val k = firstMultipleInput[1].toInt()

        val a = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

        val result = angryProfessor(k, a)

        println(result)
    }
}
