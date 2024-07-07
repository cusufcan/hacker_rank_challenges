import kotlin.math.abs

/*
 * Complete the 'bonAppetit' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY bill
 *  2. INTEGER k
 *  3. INTEGER b
 */

fun bonAppetit(bill: Array<Int>, k: Int, b: Int) {
    // Write your code here
    var annaRealPay = 0
    for (i in bill.indices) {
        if (i != k) annaRealPay += bill[i]
    }
    annaRealPay /= 2

    if (annaRealPay != b) println(abs(annaRealPay - b))
    else println("Bon Appetit")
}

fun main(args: Array<String>) {
    val firstMultipleInput = readln().trimEnd().split(" ")

    val n = firstMultipleInput[0].toInt()

    val k = firstMultipleInput[1].toInt()

    val bill = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val b = readln().trim().toInt()

    bonAppetit(bill, k, b)
}
