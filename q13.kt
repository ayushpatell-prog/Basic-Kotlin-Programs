fun simpleInterest(p: Int, r: Int, t: Int) {
    val si = (p * r * t) / 100
    println("Simple Interest = $si")
}
fun main() {
    val a = 2000
    val rate = 5
    val time = 2
    simpleInterest(a, rate, time)
}
