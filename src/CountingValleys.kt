/*
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */

fun countingValleys(steps: Int, path: String): Int {
    // Write your code here
    var level = 0
    var valleys = 0
    var inValley = false

    for (step in path) {
        if (step == 'U') level++
        else level--

        if (level < 0 && !inValley) inValley = true

        if (level == 0 && inValley) {
            valleys++
            inValley = false
        }
    }

    return valleys
}

fun main(args: Array<String>) {
    val steps = readln().trim().toInt()

    val path = readln()

    val result = countingValleys(steps, path)

    println(result)
}
