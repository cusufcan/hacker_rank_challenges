/*
 * Complete the 'permutationEquation' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY p as parameter.
 */

fun permutationEquation(p: Array<Int>): Array<Int> {
    // Write your code here
    val result = ArrayList<Int>()

    for (i in 1..p.size) {
        val x = p.indexOf(i) + 1
        val y = p.indexOf(x) + 1
        result.add(y)
    }

    return result.toTypedArray()
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val p = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = permutationEquation(p)

    println(result.joinToString("\n"))
}
