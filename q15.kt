fun main() {
    var a = 0 
    var b = 1 
    var N = 10 
    for (i in 1..N){
        print("$a ")
        val next = a + b
        a= b
        b=next
    }
}
