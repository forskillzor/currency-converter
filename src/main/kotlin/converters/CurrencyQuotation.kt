package converters

import fuel.Fuel
import fuel.get
import kotlinx.coroutines.runBlocking
import org.json.JSONObject

open class CurrencyQuotation {
    companion object {
        val quotation = mutableMapOf<String, Double>()
        val currencies = listOf("USD", "EUR", "GBP")
        private fun getQuotation(currency: String): Double {
            return quotation[currency] ?: 0.0
        }
        fun getParity(n: Double, currency: String): Double {
            val quote = getQuotation(currency)
            return n * quote
        }
    }
    fun fetch() {
        runBlocking {
            val response =
                Fuel.get("https://api.freecurrencyapi.com/v1/latest?base_currency=RUB&apikey=fca_live_XeB8rwGp3TC5PTHGcCaTdNsNSyW0fyBOzoB6cPOz").body
            val responseObj = JSONObject(response).getJSONObject("data")

            currencies.forEach { currency -> quotation[currency] = responseObj.getDouble(currency) }
        }
    }
}
