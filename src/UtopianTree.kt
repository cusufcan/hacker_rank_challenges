/*
 * Complete the 'utopianTree' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER n as parameter.
 */

fun utopianTree(n: Int): Int {
    // Write your code here
    var height = 1
    for (i in 1..n) {
        if (i % 2 == 0) height++
        else height *= 2
    }
    return height
}

fun main(args: Array<String>) {
    val t = readln().trim().toInt()

    for (tItr in 1..t) {
        val n = readln().trim().toInt()

        val result = utopianTree(n)

        println(result)
    }
}
