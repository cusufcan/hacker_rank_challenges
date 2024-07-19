/*
 * Complete the 'acmTeam' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts STRING_ARRAY topic as parameter.
 */

fun acmTeam(topic: Array<String>): Array<Int> {
    // Write your code here
    var maxTopics = 0
    var maxTeams = 0
    for (i in 0..<topic.size - 1) {
        for (j in i + 1..<topic.size) {
            var topics = 0
            for (k in 0..<topic[i].length) {
                if (topic[i][k] == '1' || topic[j][k] == '1') topics++
            }
            if (topics > maxTopics) {
                maxTopics = topics
                maxTeams = 1
            } else if (topics == maxTopics) maxTeams++
        }
    }
    return arrayOf(maxTopics, maxTeams)
}

fun main(args: Array<String>) {
    val firstMultipleInput = readln().trimEnd().split(" ")

    val n = firstMultipleInput[0].toInt()

    val m = firstMultipleInput[1].toInt()

    val topic = Array(n) { "" }
    for (i in 0..<n) {
        val topicItem = readln()
        topic[i] = topicItem
    }

    val result = acmTeam(topic)

    println(result.joinToString("\n"))
}
