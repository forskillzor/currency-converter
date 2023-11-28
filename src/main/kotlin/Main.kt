
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
                override fun convertRub(rubs: Double):Double {
                    println("Нет такой валюты ${this.currencyCode}")
                    return 0.0
                }
            }
        }
    }

    val usdConverter = Converters.get("USD")
    val eurConverter = Converters.get("EUR")
    val gbpConverter = Converters.get("GBP")
    val anotherConverter = Converters.get("another")

    val usd = usdConverter.convertRub(1.0)
    val eur = eurConverter.convertRub(1.0)
    val gbp = gbpConverter.convertRub(1.0)
    val another = anotherConverter.convertRub(1.0)

    println("1 рублей = $usd USD")

}