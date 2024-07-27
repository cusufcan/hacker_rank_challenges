/*
 * Complete the 'cavityMap' function below.
 *
 * The function is expected to return a STRING_ARRAY.
 * The function accepts STRING_ARRAY grid as parameter.
 */

fun cavityMap(grid: Array<String>): Array<String> {
    // Write your code here
    for (i in 1..<grid.size - 1) {
        for (j in 1..<grid[i].length - 1) {
            if (grid[i][j] > grid[i - 1][j] && grid[i][j] > grid[i + 1][j] && grid[i][j] > grid[i][j - 1] && grid[i][j] > grid[i][j + 1]) {
                grid[i] = grid[i].substring(0, j) + "X" + grid[i].substring(j + 1)
            }
        }
    }
    return grid
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val grid = Array(n) { "" }
    for (i in 0..<n) {
        val gridItem = readln()
        grid[i] = gridItem
    }

    val result = cavityMap(grid)

    println(result.joinToString("\n"))
}
