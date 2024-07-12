import java.util.*

/*
 * Complete the 'pangrams' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun pangrams(s: String): String {
    // Write your code here
    return if (s.lowercase(Locale.getDefault()).replace(" ", "").toSet().size == 26) "pangram"
    else "not pangram"
}

fun main(args: Array<String>) {
    val s = readln()

    val result = pangrams(s)

    println(result)
}
