fun main() {
    var a = 555
    var count = 0
    while (a > 0) {
        a = a / 10
        count++
    }
    println("Number of digits = $count")
}
