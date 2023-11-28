import CurrencyQuotation

class UsdConverter: CurrencyConverter, CurrencyQuotation(){
    override val currencyCode: String = "USD"

    override fun convertRub(rubs: Double): Double? {
        val value = getParitet(rubs, currencyCode)
        return value
    }
}