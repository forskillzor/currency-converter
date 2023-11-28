class GbpConverter: CurrencyConverter {
    override val currencyCode: String = "GBP"

    override fun convertRub() {
        println("Convert Rub to $currencyCode")
    }
}