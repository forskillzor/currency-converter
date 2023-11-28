class GbpConverter: CurrencyConverter, CurrencyQuotation(){
    override val currencyCode: String = "GBP"

    override fun convertRub(rubs: Double): Double? {
        val value = getParitet(rubs, currencyCode)
        return value
    }
}