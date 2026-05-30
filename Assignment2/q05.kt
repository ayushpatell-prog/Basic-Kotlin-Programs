abstract class Animal{
    abstract fun makeSound()
}
class Cat:Animal(){
    override fun makeSound(){
        println("meowww")
    }
}
fun main(){
    val cat=Cat()
    cat.makeSound()
}
