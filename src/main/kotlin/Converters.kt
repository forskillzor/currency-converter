val Converters = object {
    fun get(currencyCode: String): CurrencyConverter {
        when (currencyCode) {
            "USD" -> return UsdConverter()
            "EUR" -> return EurConverter()
            "GBP" -> return GbpConverter()
        }
        return object : CurrencyConverter{
            override val currencyCode: String = currencyCode
            override fun convertRub(rubs: Double): Double {
                println("Нет такой валюты ${this.currencyCode}")
                return 0.0
            }
        }
    }
}
