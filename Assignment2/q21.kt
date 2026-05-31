data class Product(val name: String, val price: Double)
fun main() {
    val inventory = listOf(
        Product("laptop",1000.0),
        Product("mouse",25.0),
        Product("keyboard",60.0)
    )
    val filteredProducts = inventory
        .map { Product(it.name, it.price * 0.9) }
        .filter { it.price > 50 }
    println(filteredProducts)
}
