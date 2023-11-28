import fuel.Fuel
import fuel.get
import kotlinx.coroutines.runBlocking
import org.json.JSONObject
import kotlin.math.round

open class CurrencyQuotation {
    companion object {
        val quotation = mutableMapOf<String, Double>()
        fun getQuotation(currency: String): Double?{
            return quotation.get(currency)
        }
        fun getParitet(n: Double, currency: String): Double? {
            val quote = getQuotation(currency)
            if (quote != null) {
                return n * quote
            }
            return null
        }
    }
    fun fetch() {
        runBlocking {
            val response =
                Fuel.get("https://api.freecurrencyapi.com/v1/latest?base_currency=RUB&apikey=fca_live_XeB8rwGp3TC5PTHGcCaTdNsNSyW0fyBOzoB6cPOz").body
            println(response)
            val responseObj = JSONObject(response).getJSONObject("data")

            val usdrub = getQuoteFromData(responseObj, "USD")
            val eurrub = getQuoteFromData(responseObj, "EUR")
            val gbprub = getQuoteFromData(responseObj, "GBP")

            quotation.put("USD", usdrub)
            quotation.put("EUR", eurrub)
            quotation.put("GBP", gbprub)
        }
    }
    private fun getQuoteFromData(data: JSONObject, currency: String): Double {
        val usdrub = 1.0 / data.getDouble(currency)
        return round(usdrub * 100) / 100

    }
}
