fun main() {
    var a = 58
    //print("Enter a number: ")
    //val a = readLine()!!.toInt
	  var rem=0
    var rev=0
    val b=a
    while (a>0){
        rem = a % 10 
        a = a / 10 
        rev = rev * 10 + rem
    }
    println("original no. = $b")
    println("reversed no. = $rev")
}
