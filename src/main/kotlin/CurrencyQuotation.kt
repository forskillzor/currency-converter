import fuel.Fuel
import fuel.get
import kotlinx.coroutines.runBlocking
import org.json.JSONObject

class CurrencyQuotation {
    val quotation = mutableMapOf<String, Double>()
    fun fetch() {
        runBlocking {
            val response =
                Fuel.get("https://api.freecurrencyapi.com/v1/latest?base_currency=EUR?apikey=fca_live_XeB8rwGp3TC5PTHGcCaTdNsNSyW0fyBOzoB6cPOz").body
            println(response)
            val responseObj = JSONObject(response).getJSONObject("data")
            println(responseObj.getBigDecimal("EUR"))
        }
    }
}
