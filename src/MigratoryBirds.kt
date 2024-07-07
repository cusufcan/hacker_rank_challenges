/*
 * Complete the 'migratoryBirds' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun migratoryBirds(arr: Array<Int>): Int {
    // Write your code here
    val birdMap = mutableMapOf<Int, Int>()
    for (bird in arr) {
        if (birdMap.containsKey(bird)) birdMap[bird] = birdMap[bird]!! + 1
        else birdMap[bird] = 1
    }

    var max = 0
    var result = 0

    for (bird in birdMap) {
        if (bird.value > max) {
            max = bird.value
            result = bird.key
        } else if (bird.value == max && bird.key < result) {
            result = bird.key
        }
    }

    return result
}

fun main(args: Array<String>) {
    val arrCount = readln().trim().toInt()

    val arr = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = migratoryBirds(arr)

    println(result)
}
