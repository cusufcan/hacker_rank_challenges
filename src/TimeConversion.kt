/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    // Write your code here
    val time = s.substring(0, 8)
    val amPm = s.substring(8, 10)

    val hour = time.substring(0, 2).toInt()
    val minute = time.substring(3, 5)
    val second = time.substring(6, 8)

    return when {
        amPm == "AM" && hour == 12 -> "00:$minute:$second"
        amPm == "PM" && hour < 12 -> "${hour + 12}:$minute:$second"
        else -> time
    }
}

fun main(args: Array<String>) {
    val s = readln()

    val result = timeConversion(s)

    println(result)
}
