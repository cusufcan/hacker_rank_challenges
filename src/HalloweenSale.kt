/*
 * Complete the 'howManyGames' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER p
 *  2. INTEGER d
 *  3. INTEGER m
 *  4. INTEGER s
 */

fun howManyGames(p: Int, d: Int, m: Int, s: Int): Int {
    // Return the number of games you can buy
    var games = 0
    var money = s
    var price = p

    while (money >= price) {
        games++
        money -= price
        if (price - d > m) price -= d
        else price = m
    }

    return games
}

fun main(args: Array<String>) {
    val firstMultipleInput = readln().trimEnd().split(" ")

    val p = firstMultipleInput[0].toInt()

    val d = firstMultipleInput[1].toInt()

    val m = firstMultipleInput[2].toInt()

    val s = firstMultipleInput[3].toInt()

    val answer = howManyGames(p, d, m, s)

    println(answer)
}
