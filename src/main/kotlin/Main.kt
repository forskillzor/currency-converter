
fun main() {
    CurrencyQuotation().fetch()

    val Converters = object {
        fun get(currencyCode: String): CurrencyConverter {
           when (currencyCode) {
               "USD" -> return UsdConverter()
               "EUR" -> return EurConverter()
               "GBP" -> return GbpConverter()
           }
            return object : CurrencyConverter{
                override val currencyCode: String = "XYZ"
                override fun convertRub() {
                    println("Нет такой валюты ${this.currencyCode}")
                }
            }
        }
    }

    val usdConverter = Converters.get("USD")
    val eurConverter = Converters.get("EUR")
    val gbpConverter = Converters.get("GBP")
    val anotherConverter = Converters.get("another")

    usdConverter.convertRub()
    eurConverter.convertRub()
    gbpConverter.convertRub()
    anotherConverter.convertRub()

}