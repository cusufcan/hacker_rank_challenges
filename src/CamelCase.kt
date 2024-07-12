/*
 * Complete the 'camelcase' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING s as parameter.
 */

fun camelcase(s: String): Int {
    // Write your code here
    var count = 1
    for (i in s) if (i == i.uppercaseChar()) count++
    return count
}

fun main(args: Array<String>) {
    val s = readln()

    val result = camelcase(s)

    println(result)
}
