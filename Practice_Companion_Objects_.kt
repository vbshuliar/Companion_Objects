class TaxCalculator {
    companion object {
        val salesTaxPercentage = 15.0
        fun getTaxAmountForOrderItems(orderItemList: List<OrderItem>): Double {
            var orderAmount: Double = 0.00
            for (item in orderItemList) {
                orderAmount += item.price
            }
            return orderAmount * salesTaxPercentage / 100
        }
    }
}

fun main() {
    val orderItemList: List<OrderItem> =
            mutableListOf<OrderItem>(
                    OrderItem("Burger", 8.00),
                    OrderItem("Fries", 4.00),
                    OrderItem("Soda", 2.00)
            )
    println(TaxCalculator.getTaxAmountForOrderItems(orderItemList))
}

class OrderItem {
    val name: String
    val price: Double
    constructor(name: String, price: Double) {
        this.name = name
        this.price = price
    }
}
