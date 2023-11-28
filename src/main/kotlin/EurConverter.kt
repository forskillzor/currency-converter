class EurConverter: CurrencyConverter {
    override val currencyCode: String = "EUR"

    override fun convertRub() {
        println("Convert Rub to $currencyCode")
    }
}