import kotlin.math.abs

/*
 * Complete the 'funnyString' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun funnyString(s: String): String {
    // Write your code here
    val diffArray = ArrayList<Int>()

    val sReversed = s.reversed()
    val diffArrayReversed = ArrayList<Int>()

    for (i in 1..<s.length) diffArray.add(abs(s[i].code - s[i - 1].code))
    for (i in 1..<s.length) diffArrayReversed.add(abs(sReversed[i].code - sReversed[i - 1].code))

    return if (diffArray == diffArrayReversed) "Funny" else "Not Funny"
}

fun main(args: Array<String>) {
    val q = readln().trim().toInt()

    for (qItr in 1..q) {
        val s = readln()

        val result = funnyString(s)

        println(result)
    }
}
