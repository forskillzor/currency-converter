import converters.CurrencyConverter
import converters.getConverters
import converters.CurrencyQuotation

fun main() {
    CurrencyQuotation().fetch()
    val convertersList = getConverters()
    val currencies = listOf("USD", "EUR", "GBP", "XYZ")
    val converters = mutableMapOf<String, CurrencyConverter>()

    val rub = 5700.0

    currencies.forEach{currency->
        converters[currency] = convertersList.get(currency)
    }

    currencies.forEach{currency ->
        println("$rub рублей = ${converters[currency]?.convertRub(rub)} $currency")
    }
}