/*
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */

fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here
    val array: Array<Int> = grades
    val size = array.size - 1
    for (i in 0..size) {
        val nextMultipleOfFive = array[i] + (5 - array[i] % 5)
        if (nextMultipleOfFive < 40) continue
        if (nextMultipleOfFive - array[i] < 3) array[i] = nextMultipleOfFive
    }
    return array
}

fun main(args: Array<String>) {
    val gradesCount = readln().trim().toInt()

    val grades = Array(gradesCount) { 0 }
    for (i in 0..<gradesCount) {
        val gradesItem = readln().trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
