fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val n = readln().toInt()
    val arr = readln().split(" ").map { it.toInt() }.toTypedArray()

    for (i in 1..<n) {
        for (j in i downTo 1) {
            if (arr[j] < arr[j - 1]) {
                val temp = arr[j]
                arr[j] = arr[j - 1]
                arr[j - 1] = temp
            }
        }
    }

    println(arr.joinToString(" "))
}