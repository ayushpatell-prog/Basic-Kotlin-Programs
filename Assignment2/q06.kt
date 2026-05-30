data class User(
    val id:Int,
    val username:String,
    val isActive:Boolean
)
fun main(){
    val user=User(1,"Ayush",true)
    println(user)
    println(user.id)
    println(user.username)
    println(user.isActive)
}
