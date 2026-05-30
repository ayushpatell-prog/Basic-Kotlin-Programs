data class User(
    val id:Int,
    val username:String,
    val isActive:Boolean
)
fun main(){
    val user=User(1,"Ayush",true)
    val inactiveUser=user.copy(isActive=false)
    println(user)
    println(inactiveUser)
}
