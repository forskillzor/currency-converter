package converters

class GbpConverter: CurrencyConverter, CurrencyQuotation(){
    override val currencyCode: String = "GBP"

    override fun convertRub(rubs: Double): Double {
        return getParity(rubs, currencyCode)
    }
}