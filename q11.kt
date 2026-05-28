fun main() {
    var a = 55
    var rem = 0
    var sum = 0
    while (a > 0) {
        rem = a % 10
        sum = sum + rem
        a = a / 10
    }
    println("Sum of digits = $sum")
}
