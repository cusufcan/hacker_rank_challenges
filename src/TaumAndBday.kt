import kotlin.math.min

/*
 * Complete the 'taumBday' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER b
 *  2. INTEGER w
 *  3. INTEGER bc
 *  4. INTEGER wc
 *  5. INTEGER z
 */

fun taumBday(b: Int, w: Int, bc: Int, wc: Int, z: Int): Long {
    // Write your code here
    val bp = min(bc.toLong(), (wc + z).toLong())
    val wp = min(wc.toLong(), (bc + z).toLong())

    return bp * b + wp * w
}

fun main(args: Array<String>) {
    val t = readln().trim().toInt()

    for (tItr in 1..t) {
        val firstMultipleInput = readln().trimEnd().split(" ")

        val b = firstMultipleInput[0].toInt()

        val w = firstMultipleInput[1].toInt()

        val secondMultipleInput = readln().trimEnd().split(" ")

        val bc = secondMultipleInput[0].toInt()

        val wc = secondMultipleInput[1].toInt()

        val z = secondMultipleInput[2].toInt()

        val result = taumBday(b, w, bc, wc, z)

        println(result)
    }
}
