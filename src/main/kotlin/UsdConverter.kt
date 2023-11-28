class UsdConverter: CurrencyConverter {
    override val currencyCode: String = "USD"

    override fun convertRub() {
        println("Convert Rub to $currencyCode")
    }
}