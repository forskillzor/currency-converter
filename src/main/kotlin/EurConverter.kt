class EurConverter: CurrencyConverter, CurrencyQuotation() {
    override val currencyCode: String = "EUR"

    override fun convertRub(rubs: Double): Double? {
        val value = getParitet(rubs, currencyCode)
        return value
    }
}