/*
 * Complete the 'designerPdfViewer' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY h
 *  2. STRING word
 */

fun designerPdfViewer(h: Array<Int>, word: String): Int {
    // Write your code here
    var max = 0
    for (c in word) {
        val index = c.code - 'a'.code
        if (h[index] > max) max = h[index]
    }
    return max * word.length
}

fun main(args: Array<String>) {

    val h = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val word = readln()

    val result = designerPdfViewer(h, word)

    println(result)
}
