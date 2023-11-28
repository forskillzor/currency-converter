package converters

interface CurrencyConverter {
    val currencyCode: String
    fun convertRub(rubs: Double): Double
}