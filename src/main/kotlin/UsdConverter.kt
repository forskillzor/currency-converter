class UsdConverter: CurrencyConverter, CurrencyQuotation(){
    override val currencyCode: String = "USD"

    override fun convertRub(rubs: Double): Double {
        return getParity(rubs, currencyCode)
    }
}