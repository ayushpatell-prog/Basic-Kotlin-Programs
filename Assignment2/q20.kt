import kotlinx.coroutines.*
fun main() = runBlocking {
    val result = async {
        5 + 20
    }
    println(result.await())
}