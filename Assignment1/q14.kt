fun main() {
    val N = 10
    for (i in 2..N) {
        var prime = true
        for (j in 2 until i) {
            if (i % j == 0) {
                prime = false
                break
            }
        }
        if (prime)
            println(i)
    }
}
