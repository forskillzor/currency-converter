import converters.getConverters
import converters.CurrencyQuotation

fun main() {
    CurrencyQuotation().fetch()
    val converters = getConverters()


    val usdConverter = converters.get("USD")
    val eurConverter = converters.get("EUR")
    val gbpConverter = converters.get("GBP")
    val anotherConverter = converters.get("XYZ")

    val usd = usdConverter.convertRub(100.0)
    val eur = eurConverter.convertRub(1.0)
    val gbp = gbpConverter.convertRub(1.0)
    val another = anotherConverter.convertRub(1.0)

    println("1 рублей = $usd USD")

}