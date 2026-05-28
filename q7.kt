fun largest(a:Int,b:Int,c:Int){
	if(a>b&&a>c){
		println("$a is largest")
	}
	else if(b>a&&b>c){
		println("$b is largest")
	}
	else{
		println("$c is largest")
	}
}
fun main(){
	val a=25
	val b=36
	val c=5
	largest(a,b,c)
}
