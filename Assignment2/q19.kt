import kotlinx.coroutines.*
fun main() = runBlocking {
    val job = launch {
        println("background task finished")
    }
    job.join()
}