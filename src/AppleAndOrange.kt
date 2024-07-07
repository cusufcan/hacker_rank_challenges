/*
 * Complete the 'countApplesAndOranges' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER s
 *  2. INTEGER t
 *  3. INTEGER a
 *  4. INTEGER b
 *  5. INTEGER_ARRAY apples
 *  6. INTEGER_ARRAY oranges
 */

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    // Write your code here
    val appleArray = ArrayList<Int>()
    val orangeArray = ArrayList<Int>()

    var appleCount = 0
    var orangeCount = 0

    for (i in apples) {
        appleArray.add(a + i)
    }

    for (i in oranges) {
        orangeArray.add(b + i)
    }

    for (i in appleArray) {
        if (i in s..t) {
            appleCount++
        }
    }

    for (i in orangeArray) {
        if (i in s..t) {
            orangeCount++
        }
    }

    println(appleCount)
    println(orangeCount)
}

fun main(args: Array<String>) {
    val firstMultipleInput = readln().trimEnd().split(" ")

    val s = firstMultipleInput[0].toInt()

    val t = firstMultipleInput[1].toInt()

    val secondMultipleInput = readln().trimEnd().split(" ")

    val a = secondMultipleInput[0].toInt()

    val b = secondMultipleInput[1].toInt()

    val thirdMultipleInput = readln().trimEnd().split(" ")

    val m = thirdMultipleInput[0].toInt()

    val n = thirdMultipleInput[1].toInt()

    val apples = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val oranges = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}
