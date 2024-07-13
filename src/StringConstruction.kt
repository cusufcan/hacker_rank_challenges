/*
 * Complete the 'stringConstruction' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING s as parameter.
 */

fun stringConstruction(s: String): Int {
    // Write your code here
    var p = ""
    var cost = 0

    for (i in s.indices) {
        if (!p.contains(s[i])) {
            p += s[i]
            cost++
        }
    }

    return cost
}

fun main(args: Array<String>) {
    val q = readln().trim().toInt()

    for (qItr in 1..q) {
        val s = readln()

        val result = stringConstruction(s)

        println(result)
    }
}
