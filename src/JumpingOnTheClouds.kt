/*
 * Complete the 'jumpingOnClouds' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY c as parameter.
 */

fun jumpingOnClouds(c: Array<Int>): Int {
    // Write your code here
    var counter = 0
    var i = 0

    while (i < c.size - 1) {
        if (i + 2 < c.size && c[i + 2] == 0) i += 2
        else i++

        counter++
    }

    return counter
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val c = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = jumpingOnClouds(c)

    println(result)
}
