fun findSum(N: Int) {
    var sum = 0
    for (i in 1..N) {
        sum=sum+i
    }
    println("SUM = $sum")
}
fun main() {
    val N = 10
    findSum(N)
}
