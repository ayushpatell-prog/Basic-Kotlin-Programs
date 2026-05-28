fun main() {
    var a = 55
	  var rem=0
    var rev=0
    val b=a
    while (a>0){
        rem = a % 10 
        a = a / 10 
        rev = rev * 10 + rem
    }
    if (b == rev) println("palindrome") else println("not palindrome")
}
