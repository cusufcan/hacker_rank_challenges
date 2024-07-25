/*
 * Complete the 'kaprekarNumbers' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER p
 *  2. INTEGER q
 */

fun kaprekarNumbers(p: Int, q: Int): Unit {
    // Write your code here
    var found = false
    for (i in p..q) {
        val square = i.toLong() * i.toLong()
        val squareStr = square.toString()
        val d = i.toString().length
        val r = squareStr.substring(squareStr.length - d)
        val l = if (squareStr.length - d > 0) squareStr.substring(0, squareStr.length - d) else "0"
        if (r.toInt() + l.toInt() == i) {
            found = true
            print("$i ")
        }
    }
    if (p > q || !found) print("INVALID RANGE")
}

fun main(args: Array<String>) {
    val p = readln().trim().toInt()

    val q = readln().trim().toInt()

    kaprekarNumbers(p, q)
}
