package converters

class EurConverter: CurrencyConverter, CurrencyQuotation() {
    override val currencyCode: String = "EUR"

    override fun convertRub(rubs: Double): Double {
        return getParity(rubs, currencyCode)
    }
}