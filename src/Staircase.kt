/*
 * Complete the 'staircase' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

fun staircase(n: Int): Unit {
    // Write your code here
    for (i in 1..n) {
        for (j in 1..n) {
            if (j <= n - i) print(" ")
            else print("#")
        }
        println()
    }
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    staircase(n)
}
