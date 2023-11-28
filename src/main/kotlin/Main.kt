
fun main() {
    CurrencyQuotation().fetch()


    val usdConverter = Converters.get("USD")
    val eurConverter = Converters.get("EUR")
    val gbpConverter = Converters.get("GBP")
    val anotherConverter = Converters.get("XYZ")

    val usd = usdConverter.convertRub(100.0)
    val eur = eurConverter.convertRub(1.0)
    val gbp = gbpConverter.convertRub(1.0)
    val another = anotherConverter.convertRub(1.0)

    println("1 рублей = $usd USD")

}